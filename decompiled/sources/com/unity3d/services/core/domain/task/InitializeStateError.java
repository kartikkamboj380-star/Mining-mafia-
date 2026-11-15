package com.unity3d.services.core.domain.task;

import I8.AbstractC0673i;
import I8.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import app.notifee.core.event.LogEvent;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
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
public final class InitializeStateError extends MetricTask<Params, Unit> {

    @NotNull
    private final ISDKDispatchers dispatchers;

    @Metadata
    public static final class Params implements BaseParams {

        @NotNull
        private final Configuration config;

        @NotNull
        private final ErrorState errorState;

        @NotNull
        private final Exception exception;

        public Params(@NotNull ErrorState errorState, @NotNull Exception exception, @NotNull Configuration config) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(exception, "exception");
            Intrinsics.checkNotNullParameter(config, "config");
            this.errorState = errorState;
            this.exception = exception;
            this.config = config;
        }

        public static /* synthetic */ Params copy$default(Params params, ErrorState errorState, Exception exc, Configuration configuration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                errorState = params.errorState;
            }
            if ((i10 & 2) != 0) {
                exc = params.exception;
            }
            if ((i10 & 4) != 0) {
                configuration = params.config;
            }
            return params.copy(errorState, exc, configuration);
        }

        @NotNull
        public final ErrorState component1() {
            return this.errorState;
        }

        @NotNull
        public final Exception component2() {
            return this.exception;
        }

        @NotNull
        public final Configuration component3() {
            return this.config;
        }

        @NotNull
        public final Params copy(@NotNull ErrorState errorState, @NotNull Exception exception, @NotNull Configuration config) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(exception, "exception");
            Intrinsics.checkNotNullParameter(config, "config");
            return new Params(errorState, exception, config);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return this.errorState == params.errorState && Intrinsics.b(this.exception, params.exception) && Intrinsics.b(this.config, params.config);
        }

        @NotNull
        public final Configuration getConfig() {
            return this.config;
        }

        @NotNull
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        @NotNull
        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return (((this.errorState.hashCode() * 31) + this.exception.hashCode()) * 31) + this.config.hashCode();
        }

        @NotNull
        public String toString() {
            return "Params(errorState=" + this.errorState + ", exception=" + this.exception + ", config=" + this.config + ')';
        }
    }

    public InitializeStateError(@NotNull ISDKDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask(LogEvent.LEVEL_ERROR);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    @Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo80doWorkgIAlus(@NotNull Params params, @NotNull b bVar) {
        InitializeStateError$doWork$1 initializeStateError$doWork$1;
        if (bVar instanceof InitializeStateError$doWork$1) {
            initializeStateError$doWork$1 = (InitializeStateError$doWork$1) bVar;
            int i10 = initializeStateError$doWork$1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                initializeStateError$doWork$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                initializeStateError$doWork$1 = new InitializeStateError$doWork$1(this, bVar);
            }
        } else {
            initializeStateError$doWork$1 = new InitializeStateError$doWork$1(this, bVar);
        }
        Object objG = initializeStateError$doWork$1.result;
        Object objE = p179r8.b.e();
        int i11 = initializeStateError$doWork$1.label;
        if (i11 == 0) {
            n.b(objG);
            K k10 = this.dispatchers.getDefault();
            InitializeStateError$doWork$2 initializeStateError$doWork$2 = new InitializeStateError$doWork$2(params, null);
            initializeStateError$doWork$1.label = 1;
            objG = AbstractC0673i.g(k10, initializeStateError$doWork$2, initializeStateError$doWork$1);
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
