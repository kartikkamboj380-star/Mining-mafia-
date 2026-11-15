package com.facebook.react.uimanager;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.facebook.react.uimanager.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1358g0 {
    NONE,
    BOX_NONE,
    BOX_ONLY,
    AUTO;


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f15702g = p189s8.a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f15696a = new a(null);

    /* JADX INFO: renamed from: com.facebook.react.uimanager.g0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(EnumC1358g0 pointerEvents) {
            Intrinsics.checkNotNullParameter(pointerEvents, "pointerEvents");
            return pointerEvents == EnumC1358g0.AUTO || pointerEvents == EnumC1358g0.BOX_ONLY;
        }

        public final boolean b(EnumC1358g0 pointerEvents) {
            Intrinsics.checkNotNullParameter(pointerEvents, "pointerEvents");
            return pointerEvents == EnumC1358g0.AUTO || pointerEvents == EnumC1358g0.BOX_NONE;
        }

        public final EnumC1358g0 c(String str) {
            if (str == null) {
                return EnumC1358g0.AUTO;
            }
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String upperCase = str.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return EnumC1358g0.valueOf(StringsKt.F(upperCase, "-", "_", false, 4, null));
        }

        private a() {
        }
    }

    public static final boolean d(EnumC1358g0 enumC1358g0) {
        return f15696a.a(enumC1358g0);
    }

    public static final boolean e(EnumC1358g0 enumC1358g0) {
        return f15696a.b(enumC1358g0);
    }
}
