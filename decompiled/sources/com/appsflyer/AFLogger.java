package com.appsflyer;

import com.appsflyer.internal.AFc1oSDK;
import com.appsflyer.internal.AFg1cSDK;
import com.appsflyer.internal.AFg1hSDK;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC7024j;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.m;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.g;

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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFLogger extends AFg1hSDK {

    @NotNull
    public static final AFLogger INSTANCE = new AFLogger();

    @NotNull
    private static final Lazy getMediationNetwork = g.a(AnonymousClass8.getMediationNetwork);

    @NotNull
    private static final Lazy AFAdRevenueData = g.a(AnonymousClass3.getRevenue);

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$1, reason: invalid class name */
    @Metadata
    static final class AnonymousClass1 extends m implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ AFg1cSDK $AFAdRevenueData;
        private /* synthetic */ String $getMediationNetwork;
        private /* synthetic */ boolean $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AFg1cSDK aFg1cSDK, String str, boolean z9) {
            super(1);
            this.$AFAdRevenueData = aFg1cSDK;
            this.$getMediationNetwork = str;
            this.$getRevenue = z9;
        }

        public final void getMonetizationNetwork(@NotNull AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.d(this.$AFAdRevenueData, this.$getMediationNetwork, this.$getRevenue);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMonetizationNetwork((AFg1hSDK) obj);
            return Unit.f45918a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$2, reason: invalid class name */
    @Metadata
    static final class AnonymousClass2 extends m implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ String $AFAdRevenueData;
        private /* synthetic */ boolean $component2;
        private /* synthetic */ boolean $component3;
        private /* synthetic */ Throwable $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ AFg1cSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z9, boolean z10, boolean z11, boolean z12) {
            super(1);
            this.$getRevenue = aFg1cSDK;
            this.$AFAdRevenueData = str;
            this.$getCurrencyIso4217Code = th;
            this.$getMonetizationNetwork = z9;
            this.$getMediationNetwork = z10;
            this.$component2 = z11;
            this.$component3 = z12;
        }

        public final void AFAdRevenueData(@NotNull AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.e(this.$getRevenue, this.$AFAdRevenueData, this.$getCurrencyIso4217Code, this.$getMonetizationNetwork, this.$getMediationNetwork, this.$component2, this.$component3);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFg1hSDK) obj);
            return Unit.f45918a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$3, reason: invalid class name */
    @Metadata
    static final class AnonymousClass3 extends m implements Function0<ExecutorService> {
        public static final AnonymousClass3 getRevenue = new AnonymousClass3();

        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return AFc1oSDK.AFAdRevenueData();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$4, reason: invalid class name */
    @Metadata
    static final class AnonymousClass4 extends m implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ AFg1cSDK $getMediationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AFg1cSDK aFg1cSDK, String str) {
            super(1);
            this.$getMediationNetwork = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
        }

        public final void AFAdRevenueData(@NotNull AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.force(this.$getMediationNetwork, this.$getCurrencyIso4217Code);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            AFAdRevenueData((AFg1hSDK) obj);
            return Unit.f45918a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$5, reason: invalid class name */
    @Metadata
    static final class AnonymousClass5 extends m implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ boolean $getCurrencyIso4217Code;
        private /* synthetic */ String $getMediationNetwork;
        private /* synthetic */ AFg1cSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(AFg1cSDK aFg1cSDK, String str, boolean z9) {
            super(1);
            this.$getRevenue = aFg1cSDK;
            this.$getMediationNetwork = str;
            this.$getCurrencyIso4217Code = z9;
        }

        public final void getMediationNetwork(@NotNull AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.i(this.$getRevenue, this.$getMediationNetwork, this.$getCurrencyIso4217Code);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMediationNetwork((AFg1hSDK) obj);
            return Unit.f45918a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$6, reason: invalid class name */
    @Metadata
    static final class AnonymousClass6 extends m implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ String $getCurrencyIso4217Code;
        private /* synthetic */ boolean $getMediationNetwork;
        private /* synthetic */ AFg1cSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(AFg1cSDK aFg1cSDK, String str, boolean z9) {
            super(1);
            this.$getRevenue = aFg1cSDK;
            this.$getCurrencyIso4217Code = str;
            this.$getMediationNetwork = z9;
        }

        public final void getMonetizationNetwork(@NotNull AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.v(this.$getRevenue, this.$getCurrencyIso4217Code, this.$getMediationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getMonetizationNetwork((AFg1hSDK) obj);
            return Unit.f45918a;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$8, reason: invalid class name */
    @Metadata
    static final class AnonymousClass8 extends m implements Function0<Set<AFg1hSDK>> {
        public static final AnonymousClass8 getMediationNetwork = new AnonymousClass8();

        AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final Set<AFg1hSDK> invoke() {
            return new LinkedHashSet();
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.AFLogger$9, reason: invalid class name */
    @Metadata
    static final class AnonymousClass9 extends m implements Function1<AFg1hSDK, Unit> {
        private /* synthetic */ String $getMediationNetwork;
        private /* synthetic */ boolean $getMonetizationNetwork;
        private /* synthetic */ AFg1cSDK $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(AFg1cSDK aFg1cSDK, String str, boolean z9) {
            super(1);
            this.$getRevenue = aFg1cSDK;
            this.$getMediationNetwork = str;
            this.$getMonetizationNetwork = z9;
        }

        public final void getCurrencyIso4217Code(@NotNull AFg1hSDK aFg1hSDK) {
            Intrinsics.checkNotNullParameter(aFg1hSDK, "");
            aFg1hSDK.w(this.$getRevenue, this.$getMediationNetwork, this.$getMonetizationNetwork);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            getCurrencyIso4217Code((AFg1hSDK) obj);
            return Unit.f45918a;
        }
    }

    @Metadata
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        private final int level;

        LogLevel(int i10) {
            this.level = i10;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    private AFLogger() {
    }

    public static final void afDebugLog(@NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, z9);
    }

    public static final void afErrorLog(@NotNull String str, @NotNull Throwable th, boolean z9, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        AFg1hSDK.e$default(INSTANCE, AFg1cSDK.OTHER, str, th, z9, z10, z11, false, 64, null);
    }

    public static final void afErrorLogForExcManagerOnly(@Nullable String str, @Nullable Throwable th) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.b0(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, false, true, false, 64, null);
    }

    public static final void afInfoLog(@NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, z9);
    }

    public static final void afLogForce(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.force(AFg1cSDK.OTHER, str);
    }

    public static final void afRDLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1cSDK.OTHER, str, true);
    }

    public static final void afVerboseLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.v(AFg1cSDK.OTHER, str, false);
    }

    public static final void afWarnLog(@NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.w(AFg1cSDK.OTHER, str, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFg1hSDK[] aFg1hSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1hSDKArr, "");
        ((Set) getMediationNetwork.getValue()).removeAll(AbstractC7024j.b0(aFg1hSDKArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFg1hSDK[] aFg1hSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1hSDKArr, "");
        CollectionsKt.y((Set) getMediationNetwork.getValue(), aFg1hSDKArr);
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(new AnonymousClass1(aFg1cSDK, str, z9)));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z9, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(new AnonymousClass2(aFg1cSDK, str, th, z9, z10, z11, z12)));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(new AnonymousClass4(aFg1cSDK, str)));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(new AnonymousClass5(aFg1cSDK, str, z9)));
    }

    public final void registerClient(@NotNull final AFg1hSDK... aFg1hSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1hSDKArr, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new Runnable() { // from class: com.appsflyer.c
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getMonetizationNetwork(aFg1hSDKArr);
            }
        });
    }

    public final void unregisterClient(@NotNull final AFg1hSDK... aFg1hSDKArr) {
        Intrinsics.checkNotNullParameter(aFg1hSDKArr, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new Runnable() { // from class: com.appsflyer.b
            @Override // java.lang.Runnable
            public final void run() {
                AFLogger.getMediationNetwork(aFg1hSDKArr);
            }
        });
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(new AnonymousClass6(aFg1cSDK, str, z9)));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((ExecutorService) AFAdRevenueData.getValue()).execute(new a(new AnonymousClass9(aFg1cSDK, str, z9)));
    }

    public static final void afDebugLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.d(AFg1cSDK.OTHER, str, true);
    }

    public static final void afInfoLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        INSTANCE.i(AFg1cSDK.OTHER, str, true);
    }

    public static final void afWarnLog(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AFg1hSDK.w$default(INSTANCE, AFg1cSDK.OTHER, str, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Iterator it = ((Set) getMediationNetwork.getValue()).iterator();
        while (it.hasNext()) {
            function1.invoke((AFg1hSDK) it.next());
        }
    }

    public static final void afErrorLog(@Nullable String str, @Nullable Throwable th) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.b0(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, false, false, false, 120, null);
    }

    public static final void afErrorLogForExcManagerOnly(@Nullable String str, @Nullable Throwable th, boolean z9) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.b0(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, false, !z9, false, 64, null);
    }

    public static final void afErrorLog(@Nullable String str, @Nullable Throwable th, boolean z9) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.b0(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, z9, false, false, 104, null);
    }

    public static final void afErrorLog(@Nullable String str, @Nullable Throwable th, boolean z9, boolean z10) {
        AFLogger aFLogger = INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.OTHER;
        if (str == null || StringsKt.b0(str)) {
            str = "null";
        }
        String str2 = str;
        if (th == null) {
            th = new NullPointerException("Invoked with null Throwable");
        }
        AFg1hSDK.e$default(aFLogger, aFg1cSDK, str2, th, false, z9, z10, false, 72, null);
    }
}
