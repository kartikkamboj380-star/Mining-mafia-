package com.unity3d.services.core.domain.task;

import I8.AbstractC0673i;
import I8.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
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
public final class ConfigFileFromLocalStorage extends MetricTask<Params, Configuration> {

    @NotNull
    private final ISDKDispatchers dispatchers;

    @Metadata
    public static final class Params implements BaseParams {

        @NotNull
        private final Configuration defaultConfiguration;

        /* JADX WARN: Multi-variable type inference failed */
        public Params() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final Configuration getDefaultConfiguration() {
            return this.defaultConfiguration;
        }

        public Params(@NotNull Configuration defaultConfiguration) {
            Intrinsics.checkNotNullParameter(defaultConfiguration, "defaultConfiguration");
            this.defaultConfiguration = defaultConfiguration;
        }

        public /* synthetic */ Params(Configuration configuration, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new Configuration() : configuration);
        }
    }

    public ConfigFileFromLocalStorage(@NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask("read_local_config");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    @Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo80doWorkgIAlus(@NotNull Params params, @NotNull b bVar) {
        ConfigFileFromLocalStorage$doWork$1 configFileFromLocalStorage$doWork$1;
        if (bVar instanceof ConfigFileFromLocalStorage$doWork$1) {
            configFileFromLocalStorage$doWork$1 = (ConfigFileFromLocalStorage$doWork$1) bVar;
            int i10 = configFileFromLocalStorage$doWork$1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                configFileFromLocalStorage$doWork$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                configFileFromLocalStorage$doWork$1 = new ConfigFileFromLocalStorage$doWork$1(this, bVar);
            }
        } else {
            configFileFromLocalStorage$doWork$1 = new ConfigFileFromLocalStorage$doWork$1(this, bVar);
        }
        Object objG = configFileFromLocalStorage$doWork$1.result;
        Object objE = p179r8.b.e();
        int i11 = configFileFromLocalStorage$doWork$1.label;
        if (i11 == 0) {
            n.b(objG);
            K io2 = this.dispatchers.getIo();
            ConfigFileFromLocalStorage$doWork$2 configFileFromLocalStorage$doWork$2 = new ConfigFileFromLocalStorage$doWork$2(params, null);
            configFileFromLocalStorage$doWork$1.label = 1;
            objG = AbstractC0673i.g(io2, configFileFromLocalStorage$doWork$2, configFileFromLocalStorage$doWork$1);
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
