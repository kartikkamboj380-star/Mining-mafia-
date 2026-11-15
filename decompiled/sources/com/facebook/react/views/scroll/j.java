package com.facebook.react.views.scroll;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C1356f0;
import java.util.Map;
import kotlin.collections.E;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16089a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void d(b bVar, Object obj, ReadableArray readableArray) {
            bVar.scrollTo(obj, new c(Math.round(C1356f0.h(readableArray.getDouble(0))), Math.round(C1356f0.h(readableArray.getDouble(1))), readableArray.getBoolean(2)));
        }

        private final void e(b bVar, Object obj, ReadableArray readableArray) {
            bVar.scrollToEnd(obj, new d(readableArray.getBoolean(0)));
        }

        public final Map a() {
            return E.i(p129m8.q.a("scrollTo", 1), p129m8.q.a("scrollToEnd", 2), p129m8.q.a("flashScrollIndicators", 3));
        }

        public final void b(b viewManager, Object obj, int i10, ReadableArray readableArray) {
            Intrinsics.checkNotNullParameter(viewManager, "viewManager");
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (i10 == 1) {
                if (readableArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                d(viewManager, obj, readableArray);
                return;
            }
            if (i10 == 2) {
                if (readableArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                e(viewManager, obj, readableArray);
            } else {
                if (i10 == 3) {
                    viewManager.flashScrollIndicators(obj);
                    return;
                }
                throw new IllegalArgumentException("Unsupported command " + i10 + " received by " + viewManager.getClass().getSimpleName() + ".");
            }
        }

        public final void c(b viewManager, Object obj, String commandType, ReadableArray readableArray) {
            Intrinsics.checkNotNullParameter(viewManager, "viewManager");
            Intrinsics.checkNotNullParameter(commandType, "commandType");
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int iHashCode = commandType.hashCode();
            if (iHashCode != -402165208) {
                if (iHashCode != 28425985) {
                    if (iHashCode == 2055114131 && commandType.equals("scrollToEnd")) {
                        if (readableArray == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        e(viewManager, obj, readableArray);
                        return;
                    }
                } else if (commandType.equals("flashScrollIndicators")) {
                    viewManager.flashScrollIndicators(obj);
                    return;
                }
            } else if (commandType.equals("scrollTo")) {
                if (readableArray == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                d(viewManager, obj, readableArray);
                return;
            }
            throw new IllegalArgumentException("Unsupported command " + commandType + " received by " + viewManager.getClass().getSimpleName() + ".");
        }

        private a() {
        }
    }

    public interface b {
        void flashScrollIndicators(Object obj);

        void scrollTo(Object obj, c cVar);

        void scrollToEnd(Object obj, d dVar);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f16092c;

        public c(int i10, int i11, boolean z9) {
            this.f16090a = i10;
            this.f16091b = i11;
            this.f16092c = z9;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f16093a;

        public d(boolean z9) {
            this.f16093a = z9;
        }
    }
}
