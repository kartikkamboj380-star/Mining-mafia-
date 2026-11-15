package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata
public abstract class AFg1hSDK {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static long getRevenue = System.currentTimeMillis();
    private final boolean shouldExtendMsg;

    @Metadata
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void d$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i10 & 4) != 0) {
            z9 = true;
        }
        aFg1hSDK.d(aFg1cSDK, str, z9);
    }

    public static /* synthetic */ void e$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z9, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i10 & 8) != 0) {
            z9 = true;
        }
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        if ((i10 & 32) != 0) {
            z11 = true;
        }
        if ((i10 & 64) != 0) {
            z12 = true;
        }
        aFg1hSDK.e(aFg1cSDK, str, th, z9, z10, z11, z12);
    }

    public static /* synthetic */ void i$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i10 & 4) != 0) {
            z9 = true;
        }
        aFg1hSDK.i(aFg1cSDK, str, z9);
    }

    public static /* synthetic */ void v$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i10 & 4) != 0) {
            z9 = true;
        }
        aFg1hSDK.v(aFg1cSDK, str, z9);
    }

    public static /* synthetic */ void w$default(AFg1hSDK aFg1hSDK, AFg1cSDK aFg1cSDK, String str, boolean z9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException();
        }
        if ((i10 & 4) != 0) {
            z9 = true;
        }
        aFg1hSDK.w(aFg1cSDK, str, z9);
    }

    public void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z9, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
    }

    public void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @NotNull
    protected final String getMonetizationNetwork(@Nullable String str, @NotNull AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        if (str == null || StringsKt.b0(str)) {
            str = "null";
        }
        String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1cSDK);
        if (!getShouldExtendMsg()) {
            return strWithTag$SDK_prodRelease;
        }
        return "(" + (System.currentTimeMillis() - getRevenue) + ") [" + Thread.currentThread().getName() + "] " + strWithTag$SDK_prodRelease;
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFg1cSDK aFg1cSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        return "[" + aFg1cSDK.getCurrencyIso4217Code + "] " + str;
    }

    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, false, false, false, false, 120, null);
    }

    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFg1cSDK, str, false, 4, null);
    }

    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z9, false, false, false, 112, null);
    }

    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z9, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z9, z10, false, false, 96, null);
    }

    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z9, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        e$default(this, aFg1cSDK, str, th, z9, z10, z11, false, 64, null);
    }
}
