package com.unity3d.services.core.device;

import L8.M;
import L8.x;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

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
public class Storage extends JsonStorage {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final x onStorageEventCallbacks = M.a(CollectionsKt.i());

    @NotNull
    private final String _targetFileName;

    @NotNull
    private final StorageManager.StorageType type;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void addStorageEventCallback(@NotNull Function1<? super StorageEventInfo, Unit> callback) {
            Object value;
            Intrinsics.checkNotNullParameter(callback, "callback");
            x xVar = Storage.onStorageEventCallbacks;
            do {
                value = xVar.getValue();
            } while (!xVar.h(value, CollectionsKt.l0((List) value, callback)));
        }

        public final void removeStorageEventCallback(@NotNull Function1<? super StorageEventInfo, Unit> callback) {
            Object value;
            Intrinsics.checkNotNullParameter(callback, "callback");
            x xVar = Storage.onStorageEventCallbacks;
            do {
                value = xVar.getValue();
            } while (!xVar.h(value, CollectionsKt.j0((List) value, callback)));
        }

        private Companion() {
        }
    }

    public Storage(@NotNull String _targetFileName, @NotNull StorageManager.StorageType type) {
        Intrinsics.checkNotNullParameter(_targetFileName, "_targetFileName");
        Intrinsics.checkNotNullParameter(type, "type");
        this._targetFileName = _targetFileName;
        this.type = type;
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    @NotNull
    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        try {
            boolean z9 = false;
            try {
                try {
                    byte[] fileBytes = Utilities.readFileBytes(new File(this._targetFileName));
                    if (fileBytes == null) {
                        return false;
                    }
                    setData(new JSONObject(new String(fileBytes, Charsets.UTF_8)));
                    z9 = true;
                } catch (FileNotFoundException e10) {
                    DeviceLog.debug("Storage JSON file not found in local cache:", e10);
                }
            } catch (Exception e11) {
                DeviceLog.debug("Failed to read storage JSON file:", e11);
            }
            return z9;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void sendEvent(@Nullable StorageEvent storageEvent, @Nullable Object obj) {
        List list = (List) onStorageEventCallbacks.getValue();
        if (list.isEmpty()) {
            if (!(WebViewApp.getCurrentApp() != null ? WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this.type.name(), obj) : false)) {
                DeviceLog.debug("Couldn't send storage event to WebApp");
            }
            return;
        }
        Intrinsics.c(storageEvent);
        StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(storageEventInfo);
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }
}
