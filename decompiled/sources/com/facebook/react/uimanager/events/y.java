package com.facebook.react.uimanager.events;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public enum y {
    START("topTouchStart"),
    END("topTouchEnd"),
    MOVE("topTouchMove"),
    CANCEL("topTouchCancel");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15675a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f15674h = p189s8.a.a(c());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f15668b = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(y type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return type.d();
        }

        private a() {
        }
    }

    y(String str) {
        this.f15675a = str;
    }

    public final String d() {
        return this.f15675a;
    }
}
