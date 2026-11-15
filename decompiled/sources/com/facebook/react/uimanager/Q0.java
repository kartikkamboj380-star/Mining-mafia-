package com.facebook.react.uimanager;

import java.util.Comparator;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class Q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15470c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Comparator f15471d = new Comparator() { // from class: com.facebook.react.uimanager.P0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Q0.b((Q0) obj, (Q0) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15473b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        p064g3.b.a("ViewAtIndex", p064g3.a.ERROR);
    }

    public Q0(int i10, int i11) {
        this.f15472a = i10;
        this.f15473b = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(Q0 q10, Q0 q11) {
        return q10.f15473b - q11.f15473b;
    }

    public boolean equals(Object obj) {
        if (obj != null && Intrinsics.b(obj.getClass(), Q0.class)) {
            Q0 q10 = (Q0) obj;
            if (this.f15473b == q10.f15473b && this.f15472a == q10.f15472a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f15472a), Integer.valueOf(this.f15473b));
    }

    public String toString() {
        return "[" + this.f15472a + ", " + this.f15473b + "]";
    }
}
