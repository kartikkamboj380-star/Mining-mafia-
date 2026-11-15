package K2;

import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d extends K2.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f2550j = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p083i2.c a(d0 producer, l0 settableProducerContext, Q2.d listener) {
            Intrinsics.checkNotNullParameter(producer, "producer");
            Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
            Intrinsics.checkNotNullParameter(listener, "listener");
            return new d(producer, settableProducerContext, listener, null);
        }

        private a() {
        }
    }

    public /* synthetic */ d(d0 d0Var, l0 l0Var, Q2.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(d0Var, l0Var, dVar);
    }

    private d(d0 d0Var, l0 l0Var, Q2.d dVar) {
        super(d0Var, l0Var, dVar);
    }
}
