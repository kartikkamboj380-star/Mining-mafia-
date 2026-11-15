package W;

import I8.InterfaceC0702x;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    public static final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function2 f6429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0702x f6430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final I f6431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final CoroutineContext f6432d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 transform, InterfaceC0702x ack, I i10, CoroutineContext callerContext) {
            super(null);
            Intrinsics.checkNotNullParameter(transform, "transform");
            Intrinsics.checkNotNullParameter(ack, "ack");
            Intrinsics.checkNotNullParameter(callerContext, "callerContext");
            this.f6429a = transform;
            this.f6430b = ack;
            this.f6431c = i10;
            this.f6432d = callerContext;
        }

        public final InterfaceC0702x a() {
            return this.f6430b;
        }

        public final CoroutineContext b() {
            return this.f6432d;
        }

        public I c() {
            return this.f6431c;
        }

        public final Function2 d() {
            return this.f6429a;
        }
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private w() {
    }
}
