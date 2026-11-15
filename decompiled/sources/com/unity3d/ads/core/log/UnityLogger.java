package com.unity3d.ads.core.log;

import android.util.Log;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.CreateFile;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class UnityLogger implements Logger {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String LOG_TAG = "UnityAds";
    private final boolean isForced;

    @NotNull
    private LogLevel logLevel;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public UnityLogger(@NotNull SessionRepository sessionRepository, @NotNull CreateFile createFile) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(createFile, "createFile");
        this.logLevel = LogLevel.INFO;
        File fileInvoke = createFile.invoke("/data/local/tmp/UnityAdsForceDebugMode");
        boolean z9 = false;
        try {
            try {
                boolean enableTracing = sessionRepository.getNativeConfiguration().getDebugSettings().getEnableTracing();
                if (fileInvoke.exists() || enableTracing) {
                    setLogLevel(LogLevel.TRACE);
                    debug("Unity logger initialized in TRACE mode");
                }
                this.isForced = getLogLevel() == LogLevel.TRACE;
            } catch (Throwable unused) {
                Log.w(LOG_TAG, "An issue occurred while initializing the logger");
            }
        } finally {
            this.isForced = getLogLevel() == LogLevel.TRACE;
        }
    }

    private final boolean canLog(int i10) {
        return i10 >= getLogLevel().toAndroidLogLevel();
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(3)) {
            Log.d(LOG_TAG, message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void error(@NotNull String message, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(6)) {
            Log.e(LOG_TAG, message, th);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    @NotNull
    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void info(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(4)) {
            Log.i(LOG_TAG, message);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void setLogLevel(@NotNull LogLevel value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.isForced) {
            return;
        }
        this.logLevel = value;
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void trace(@NotNull String message, @Nullable Throwable th) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (canLog(2)) {
            Log.v(LOG_TAG, message, th);
        }
    }

    @Override // com.unity3d.ads.core.log.Logger
    public void debug(@NotNull Function0<String> fb) {
        Intrinsics.checkNotNullParameter(fb, "fb");
        if (canLog(3)) {
            debug((String) fb.invoke());
        }
    }
}
