package com.unity3d.services.core.device;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class VolumeChangeContentObserver implements VolumeChange {

    @Nullable
    private ContentObserver contentObserver;

    @NotNull
    private List<VolumeChangeListener> listeners = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void triggerListeners() {
        for (VolumeChangeListener volumeChangeListener : this.listeners) {
            volumeChangeListener.onVolumeChanged(Device.getStreamVolume(volumeChangeListener.getStreamType()));
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void clearAllListeners() {
        this.listeners.clear();
        stopObserving();
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void registerListener(@NotNull VolumeChangeListener volumeChangeListener) {
        Intrinsics.checkNotNullParameter(volumeChangeListener, "volumeChangeListener");
        if (!this.listeners.contains(volumeChangeListener)) {
            startObserving();
            this.listeners.add(volumeChangeListener);
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void startObserving() {
        ContentResolver contentResolver;
        if (this.contentObserver != null) {
            return;
        }
        this.contentObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.unity3d.services.core.device.VolumeChangeContentObserver.startObserving.1
            @Override // android.database.ContentObserver
            public boolean deliverSelfNotifications() {
                return false;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean z9, @Nullable Uri uri) {
                VolumeChangeContentObserver.this.triggerListeners();
            }
        };
        Context applicationContext = ClientProperties.getApplicationContext();
        if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
            Uri uri = Settings.System.CONTENT_URI;
            ContentObserver contentObserver = this.contentObserver;
            Intrinsics.d(contentObserver, "null cannot be cast to non-null type android.database.ContentObserver");
            contentResolver.registerContentObserver(uri, true, contentObserver);
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void stopObserving() {
        ContentResolver contentResolver;
        try {
            if (this.contentObserver == null) {
                return;
            }
            Context applicationContext = ClientProperties.getApplicationContext();
            if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
                ContentObserver contentObserver = this.contentObserver;
                Intrinsics.c(contentObserver);
                contentResolver.unregisterContentObserver(contentObserver);
            }
            this.contentObserver = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.unity3d.services.core.device.VolumeChange
    public synchronized void unregisterListener(@NotNull VolumeChangeListener volumeChangeListener) {
        Intrinsics.checkNotNullParameter(volumeChangeListener, "volumeChangeListener");
        this.listeners.remove(volumeChangeListener);
        if (this.listeners.isEmpty()) {
            stopObserving();
        }
    }
}
