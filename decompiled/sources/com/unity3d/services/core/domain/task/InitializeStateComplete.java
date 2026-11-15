package com.unity3d.services.core.domain.task;

import I8.AbstractC0673i;
import I8.K;
import W.InterfaceC0984i;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Metadata;
import kotlin.Unit;
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
public final class InitializeStateComplete extends MetricTask<Params, Unit> {

    @NotNull
    private final InterfaceC0984i dataStore;

    @NotNull
    private final ISDKDispatchers dispatchers;

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

    public InitializeStateComplete(@NotNull InterfaceC0984i dataStore, @NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dataStore = dataStore;
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask("completion");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    @Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo80doWorkgIAlus(@NotNull Params params, @NotNull b bVar) {
        InitializeStateComplete$doWork$1 initializeStateComplete$doWork$1;
        if (bVar instanceof InitializeStateComplete$doWork$1) {
            initializeStateComplete$doWork$1 = (InitializeStateComplete$doWork$1) bVar;
            int i10 = initializeStateComplete$doWork$1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                initializeStateComplete$doWork$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                initializeStateComplete$doWork$1 = new InitializeStateComplete$doWork$1(this, bVar);
            }
        } else {
            initializeStateComplete$doWork$1 = new InitializeStateComplete$doWork$1(this, bVar);
        }
        Object objG = initializeStateComplete$doWork$1.result;
        Object objE = p179r8.b.e();
        int i11 = initializeStateComplete$doWork$1.label;
        if (i11 == 0) {
            n.b(objG);
            K k10 = this.dispatchers.getDefault();
            InitializeStateComplete$doWork$2 initializeStateComplete$doWork$2 = new InitializeStateComplete$doWork$2(params, this, null);
            initializeStateComplete$doWork$1.label = 1;
            objG = AbstractC0673i.g(k10, initializeStateComplete$doWork$2, initializeStateComplete$doWork$1);
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
