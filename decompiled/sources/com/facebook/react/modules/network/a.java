package com.facebook.react.modules.network;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0343a f14996a = new C0343a(null);

    /* JADX INFO: renamed from: com.facebook.react.modules.network.a$a, reason: collision with other inner class name */
    public static final class C0343a {
        public /* synthetic */ C0343a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            StringBuilder sb = new StringBuilder(name.length());
            int length = name.length();
            boolean z9 = false;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = name.charAt(i10);
                if (Intrinsics.e(cCharAt, 32) <= 0 || Intrinsics.e(cCharAt, 127) >= 0) {
                    z9 = true;
                } else {
                    sb.append(cCharAt);
                }
            }
            if (!z9) {
                return name;
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        private C0343a() {
        }
    }
}
