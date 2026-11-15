package com.facebook.react.uimanager;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1352d0 extends P {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f15563b = new a(null);

    /* JADX INFO: renamed from: com.facebook.react.uimanager.d0$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        p064g3.b.a("NoSuchNativeViewException", p064g3.a.ERROR);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1352d0(String detailMessage) {
        super(detailMessage);
        Intrinsics.checkNotNullParameter(detailMessage, "detailMessage");
    }
}
