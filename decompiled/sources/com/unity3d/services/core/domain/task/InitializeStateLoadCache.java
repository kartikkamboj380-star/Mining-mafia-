package com.unity3d.services.core.domain.task;

import I8.AbstractC0673i;
import I8.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.SdkProperties;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.m;
import p129m8.n;
import p169q8.b;

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
public final class InitializeStateLoadCache extends MetricTask<Params, LoadCacheResult> {

    @NotNull
    private final ISDKDispatchers dispatchers;

    @Metadata
    public static final class LoadCacheResult {
        private final boolean hasHashMismatch;

        @Nullable
        private final String webViewData;

        public LoadCacheResult(boolean z9, @Nullable String str) {
            this.hasHashMismatch = z9;
            this.webViewData = str;
        }

        public static /* synthetic */ LoadCacheResult copy$default(LoadCacheResult loadCacheResult, boolean z9, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z9 = loadCacheResult.hasHashMismatch;
            }
            if ((i10 & 2) != 0) {
                str = loadCacheResult.webViewData;
            }
            return loadCacheResult.copy(z9, str);
        }

        public final boolean component1() {
            return this.hasHashMismatch;
        }

        @Nullable
        public final String component2() {
            return this.webViewData;
        }

        @NotNull
        public final LoadCacheResult copy(boolean z9, @Nullable String str) {
            return new LoadCacheResult(z9, str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadCacheResult)) {
                return false;
            }
            LoadCacheResult loadCacheResult = (LoadCacheResult) obj;
            return this.hasHashMismatch == loadCacheResult.hasHashMismatch && Intrinsics.b(this.webViewData, loadCacheResult.webViewData);
        }

        public final boolean getHasHashMismatch() {
            return this.hasHashMismatch;
        }

        @Nullable
        public final String getWebViewData() {
            return this.webViewData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z9 = this.hasHashMismatch;
            ?? r10 = z9;
            if (z9) {
                r10 = 1;
            }
            int i10 = r10 * 31;
            String str = this.webViewData;
            return i10 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "LoadCacheResult(hasHashMismatch=" + this.hasHashMismatch + ", webViewData=" + this.webViewData + ')';
        }

        public /* synthetic */ LoadCacheResult(boolean z9, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z9, (i10 & 2) != 0 ? null : str);
        }
    }

    @Metadata
    public static final class Params implements BaseParams {

        @NotNull
        private final Configuration config;

        public Params(@NotNull Configuration config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        @NotNull
        public final Configuration component1() {
            return this.config;
        }

        @NotNull
        public final Params copy(@NotNull Configuration config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return new Params(config);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && Intrinsics.b(this.config, ((Params) obj).config);
        }

        @NotNull
        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        @NotNull
        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateLoadCache(@NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getWebViewData() {
        try {
            return Utilities.readFileBytes(new File(SdkProperties.getLocalWebViewFile()));
        } catch (Exception e10) {
            DeviceLog.debug("Unity Ads init: webapp not found in local cache: " + e10.getMessage());
            return null;
        }
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask("read_local_webview");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    @Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo80doWorkgIAlus(@NotNull Params params, @NotNull b bVar) {
        InitializeStateLoadCache$doWork$1 initializeStateLoadCache$doWork$1;
        if (bVar instanceof InitializeStateLoadCache$doWork$1) {
            initializeStateLoadCache$doWork$1 = (InitializeStateLoadCache$doWork$1) bVar;
            int i10 = initializeStateLoadCache$doWork$1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                initializeStateLoadCache$doWork$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                initializeStateLoadCache$doWork$1 = new InitializeStateLoadCache$doWork$1(this, bVar);
            }
        } else {
            initializeStateLoadCache$doWork$1 = new InitializeStateLoadCache$doWork$1(this, bVar);
        }
        Object objG = initializeStateLoadCache$doWork$1.result;
        Object objE = p179r8.b.e();
        int i11 = initializeStateLoadCache$doWork$1.label;
        if (i11 == 0) {
            n.b(objG);
            K k10 = this.dispatchers.getDefault();
            InitializeStateLoadCache$doWork$2 initializeStateLoadCache$doWork$2 = new InitializeStateLoadCache$doWork$2(this, params, null);
            initializeStateLoadCache$doWork$1.label = 1;
            objG = AbstractC0673i.g(k10, initializeStateLoadCache$doWork$2, initializeStateLoadCache$doWork$1);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(objG);
        }
        return ((m) objG).i();
    }
}
