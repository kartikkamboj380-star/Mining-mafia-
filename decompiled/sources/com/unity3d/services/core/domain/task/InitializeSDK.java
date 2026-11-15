package com.unity3d.services.core.domain.task;

import I8.AbstractC0673i;
import I8.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
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
public final class InitializeSDK extends MetricTask<EmptyParams, Unit> {

    @NotNull
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;

    @NotNull
    private final ISDKDispatchers dispatchers;

    @NotNull
    private final InitializeStateComplete initializeStateComplete;

    @NotNull
    private final InitializeStateConfig initializeStateConfig;

    @NotNull
    private final InitializeStateCreate initializeStateCreate;

    @NotNull
    private final InitializeStateError initializeStateError;

    @NotNull
    private final InitializeStateLoadCache initializeStateLoadCache;

    @NotNull
    private final InitializeStateLoadWeb initializeStateLoadWeb;

    @NotNull
    private final InitializeStateReset initializeStateReset;

    /* JADX INFO: renamed from: com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1, reason: invalid class name */
    @f(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {111}, m = "handleInitializationException")
    @Metadata
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= LinearLayoutManager.INVALID_OFFSET;
            return InitializeSDK.this.handleInitializationException(null, this);
        }
    }

    public InitializeSDK(@NotNull ISDKDispatchers dispatchers, @NotNull ConfigFileFromLocalStorage configFileFromLocalStorage, @NotNull InitializeStateReset initializeStateReset, @NotNull InitializeStateError initializeStateError, @NotNull InitializeStateConfig initializeStateConfig, @NotNull InitializeStateCreate initializeStateCreate, @NotNull InitializeStateLoadCache initializeStateLoadCache, @NotNull InitializeStateLoadWeb initializeStateLoadWeb, @NotNull InitializeStateComplete initializeStateComplete) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(configFileFromLocalStorage, "configFileFromLocalStorage");
        Intrinsics.checkNotNullParameter(initializeStateReset, "initializeStateReset");
        Intrinsics.checkNotNullParameter(initializeStateError, "initializeStateError");
        Intrinsics.checkNotNullParameter(initializeStateConfig, "initializeStateConfig");
        Intrinsics.checkNotNullParameter(initializeStateCreate, "initializeStateCreate");
        Intrinsics.checkNotNullParameter(initializeStateLoadCache, "initializeStateLoadCache");
        Intrinsics.checkNotNullParameter(initializeStateLoadWeb, "initializeStateLoadWeb");
        Intrinsics.checkNotNullParameter(initializeStateComplete, "initializeStateComplete");
        this.dispatchers = dispatchers;
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.initializeStateReset = initializeStateReset;
        this.initializeStateError = initializeStateError;
        this.initializeStateConfig = initializeStateConfig;
        this.initializeStateCreate = initializeStateCreate;
        this.initializeStateLoadCache = initializeStateLoadCache;
        this.initializeStateLoadWeb = initializeStateLoadWeb;
        this.initializeStateComplete = initializeStateComplete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: executeErrorState-BWLJW6A, reason: not valid java name */
    public final Object m85executeErrorStateBWLJW6A(ErrorState errorState, Throwable th, Configuration configuration, b bVar) {
        InitializeSDK$executeErrorState$1 initializeSDK$executeErrorState$1;
        if (bVar instanceof InitializeSDK$executeErrorState$1) {
            initializeSDK$executeErrorState$1 = (InitializeSDK$executeErrorState$1) bVar;
            int i10 = initializeSDK$executeErrorState$1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                initializeSDK$executeErrorState$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                initializeSDK$executeErrorState$1 = new InitializeSDK$executeErrorState$1(this, bVar);
            }
        } else {
            initializeSDK$executeErrorState$1 = new InitializeSDK$executeErrorState$1(this, bVar);
        }
        Object obj = initializeSDK$executeErrorState$1.result;
        Object objE = p179r8.b.e();
        int i11 = initializeSDK$executeErrorState$1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
            return ((m) obj).i();
        }
        n.b(obj);
        InitializeStateError initializeStateError = this.initializeStateError;
        InitializeStateError.Params params = new InitializeStateError.Params(errorState, new Exception(th != null ? th.getMessage() : null), configuration);
        initializeSDK$executeErrorState$1.label = 1;
        Object objMo81invokegIAlus = initializeStateError.mo81invokegIAlus(params, initializeSDK$executeErrorState$1);
        return objMo81invokegIAlus == objE ? objE : objMo81invokegIAlus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object handleInitializationException(InitializationException initializationException, b bVar) throws InitializationException {
        AnonymousClass1 anonymousClass1;
        if (bVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) bVar;
            int i10 = anonymousClass1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                anonymousClass1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                anonymousClass1 = new AnonymousClass1(bVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(bVar);
        }
        Object obj = anonymousClass1.result;
        Object objE = p179r8.b.e();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InitializationException initializationException2 = (InitializationException) anonymousClass1.L$0;
            n.b(obj);
            ((m) obj).i();
            throw initializationException2;
        }
        n.b(obj);
        ErrorState errorState = initializationException.getErrorState();
        Throwable originalException = initializationException.getOriginalException();
        Configuration config = initializationException.getConfig();
        anonymousClass1.L$0 = initializationException;
        anonymousClass1.label = 1;
        if (m85executeErrorStateBWLJW6A(errorState, originalException, config, anonymousClass1) == objE) {
            return objE;
        }
        throw initializationException;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    @NotNull
    public String getMetricName() {
        return getMetricNameForInitializeTask(MobileAdsBridgeBase.initializeMethodName);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.services.core.domain.task.BaseTask
    @Nullable
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name and merged with bridge method [inline-methods] */
    public Object mo80doWorkgIAlus(@NotNull EmptyParams emptyParams, @NotNull b bVar) {
        InitializeSDK$doWork$1 initializeSDK$doWork$1;
        if (bVar instanceof InitializeSDK$doWork$1) {
            initializeSDK$doWork$1 = (InitializeSDK$doWork$1) bVar;
            int i10 = initializeSDK$doWork$1.label;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                initializeSDK$doWork$1.label = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                initializeSDK$doWork$1 = new InitializeSDK$doWork$1(this, bVar);
            }
        } else {
            initializeSDK$doWork$1 = new InitializeSDK$doWork$1(this, bVar);
        }
        Object objG = initializeSDK$doWork$1.result;
        Object objE = p179r8.b.e();
        int i11 = initializeSDK$doWork$1.label;
        if (i11 == 0) {
            n.b(objG);
            K k10 = this.dispatchers.getDefault();
            InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this, null);
            initializeSDK$doWork$1.label = 1;
            objG = AbstractC0673i.g(k10, initializeSDK$doWork$2, initializeSDK$doWork$1);
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
