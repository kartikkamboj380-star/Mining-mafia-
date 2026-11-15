package com.unity3d.services.core.domain.task;

import I8.AbstractC0673i;
import I8.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Metadata;
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
public final class InitializeStateConfig extends MetricTask<Params, Configuration> {

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final InitializeStateConfigWithLoader initializeStateConfigWithLoader;

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

    public InitializeStateConfig(@NotNull ISDKDispatchers dispatchers, @NotNull InitializeStateConfigWithLoader initializeStateConfigWithLoader) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(initializeStateConfigWithLoader, "initializeStateConfigWithLoader");
        this.dispatchers = dispatchers;
        this.initializeStateConfigWithLoader = initializeStateConfigWithLoader;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask("config_fetch");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    @Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo80doWorkgIAlus(@NotNull Params params, @NotNull b bVar) {
        InitializeStateConfig$doWork$1 initializeStateConfig$doWork$1;
        if (bVar instanceof InitializeStateConfig$doWork$1) {
            initializeStateConfig$doWork$1 = (InitializeStateConfig$doWork$1) bVar;
            int i10 = initializeStateConfig$doWork$1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                initializeStateConfig$doWork$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                initializeStateConfig$doWork$1 = new InitializeStateConfig$doWork$1(this, bVar);
            }
        } else {
            initializeStateConfig$doWork$1 = new InitializeStateConfig$doWork$1(this, bVar);
        }
        Object objG = initializeStateConfig$doWork$1.result;
        Object objE = p179r8.b.e();
        int i11 = initializeStateConfig$doWork$1.label;
        if (i11 == 0) {
            n.b(objG);
            K k10 = this.dispatchers.getDefault();
            InitializeStateConfig$doWork$2 initializeStateConfig$doWork$2 = new InitializeStateConfig$doWork$2(params, this, null);
            initializeStateConfig$doWork$1.label = 1;
            objG = AbstractC0673i.g(k10, initializeStateConfig$doWork$2, initializeStateConfig$doWork$1);
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
