package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: loaded from: classes.dex */
public final class AFj1nSDK {

    @NotNull
    final Intent getMediationNetwork;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1nSDK$1, reason: invalid class name */
    @Metadata
    static final class AnonymousClass1 extends kotlin.jvm.internal.m implements Function0<Intent> {
        private /* synthetic */ long $getMediationNetwork;
        private /* synthetic */ String $getMonetizationNetwork;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, long j10) {
            super(0);
            this.$getMonetizationNetwork = str;
            this.$getMediationNetwork = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: K_, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return AFj1nSDK.this.getMediationNetwork.putExtra(this.$getMonetizationNetwork, this.$getMediationNetwork);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1nSDK$3, reason: invalid class name */
    @Metadata
    static final class AnonymousClass3<T> extends kotlin.jvm.internal.m implements Function0<T> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: J_, reason: merged with bridge method [inline-methods] */
        public final Parcelable invoke() {
            return AFj1nSDK.this.getMediationNetwork.getParcelableExtra(this.$AFAdRevenueData);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1nSDK$4, reason: invalid class name */
    @Metadata
    static final class AnonymousClass4 extends kotlin.jvm.internal.m implements Function0<Boolean> {
        private /* synthetic */ String $getRevenue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(String str) {
            super(0);
            this.$getRevenue = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(AFj1nSDK.this.getMediationNetwork.hasExtra(this.$getRevenue));
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1nSDK$5, reason: invalid class name */
    @Metadata
    static final class AnonymousClass5 extends kotlin.jvm.internal.m implements Function0<String> {
        private /* synthetic */ String $AFAdRevenueData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(String str) {
            super(0);
            this.$AFAdRevenueData = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return AFj1nSDK.this.getMediationNetwork.getStringExtra(this.$AFAdRevenueData);
        }
    }

    public AFj1nSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getMediationNetwork = intent;
    }

    private final <T> T getCurrencyIso4217Code(Function0<? extends T> function0, String str, T t10, boolean z9) {
        Object objB;
        Object objB2;
        Object currencyIso4217Code;
        synchronized (this.getMediationNetwork) {
            try {
                m8.m.a aVar = p129m8.m.f46450b;
                objB = p129m8.m.b(function0.invoke());
            } catch (Throwable th) {
                m8.m.a aVar2 = p129m8.m.f46450b;
                objB = p129m8.m.b(p129m8.n.a(th));
            }
            F8.c[] cVarArr = {kotlin.jvm.internal.F.b(ConcurrentModificationException.class), kotlin.jvm.internal.F.b(ArrayIndexOutOfBoundsException.class)};
            Throwable thD = p129m8.m.d(objB);
            if (thD != null) {
                try {
                    if (!AbstractC7024j.t(cVarArr, kotlin.jvm.internal.F.b(thD.getClass()))) {
                        throw thD;
                    }
                    if (z9) {
                        currencyIso4217Code = getCurrencyIso4217Code(function0, str, t10, false);
                    } else {
                        AFLogger.afErrorLog(str, thD, false, false);
                        currencyIso4217Code = t10;
                    }
                    objB2 = p129m8.m.b(currencyIso4217Code);
                    objB = objB2;
                } catch (Throwable th2) {
                    m8.m.a aVar3 = p129m8.m.f46450b;
                    objB2 = p129m8.m.b(p129m8.n.a(th2));
                }
            }
            Throwable thD2 = p129m8.m.d(objB);
            if (thD2 == null) {
                t10 = (T) objB;
            } else {
                AFLogger.afErrorLog(str, thD2, false, false);
            }
        }
        return t10;
    }

    public final boolean AFAdRevenueData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) getCurrencyIso4217Code(new AnonymousClass4(str), "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Nullable
    public final <T extends Parcelable> T H_(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) getCurrencyIso4217Code(new AnonymousClass3(str), "Error while trying to read " + str + " extra from intent", null, true);
    }

    @Nullable
    public final Intent I_(@NotNull String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) getCurrencyIso4217Code(new AnonymousClass1(str, j10), "Error while trying to write " + str + " extra to intent", null, true);
    }

    @Nullable
    public final String getMediationNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) getCurrencyIso4217Code(new AnonymousClass5(str), "Error while trying to read " + str + " extra from intent", null, true);
    }
}
