package K2;

import Y1.k;
import com.facebook.imagepipeline.producers.AbstractC1249c;
import com.facebook.imagepipeline.producers.InterfaceC1260n;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends p083i2.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l0 f2547h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Q2.d f2548i;

    /* JADX INFO: renamed from: K2.a$a, reason: collision with other inner class name */
    public static final class C0036a extends AbstractC1249c {
        C0036a() {
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        protected void f() {
            a.this.D();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        protected void g(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            a.this.E(throwable);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        protected void h(Object obj, int i10) {
            a aVar = a.this;
            aVar.F(obj, i10, aVar.C());
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1249c
        protected void i(float f10) {
            a.this.s(f10);
        }
    }

    protected a(d0 producer, l0 settableProducerContext, Q2.d requestListener) {
        Intrinsics.checkNotNullParameter(producer, "producer");
        Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        this.f2547h = settableProducerContext;
        this.f2548i = requestListener;
        if (!V2.b.d()) {
            o(settableProducerContext.getExtras());
            if (V2.b.d()) {
                V2.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.a(settableProducerContext);
                    Unit unit = Unit.f45918a;
                    V2.b.b();
                } catch (Throwable th) {
                    V2.b.b();
                    throw th;
                }
            } else {
                requestListener.a(settableProducerContext);
            }
            if (!V2.b.d()) {
                producer.b(A(), settableProducerContext);
                return;
            }
            V2.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                producer.b(A(), settableProducerContext);
                Unit unit2 = Unit.f45918a;
                return;
            } finally {
                V2.b.b();
            }
        }
        V2.b.a("AbstractProducerToDataSourceAdapter()");
        try {
            o(settableProducerContext.getExtras());
            if (V2.b.d()) {
                V2.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.a(settableProducerContext);
                    Unit unit3 = Unit.f45918a;
                    V2.b.b();
                } catch (Throwable th2) {
                    V2.b.b();
                    throw th2;
                }
            } else {
                requestListener.a(settableProducerContext);
            }
            if (V2.b.d()) {
                V2.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    producer.b(A(), settableProducerContext);
                    Unit unit4 = Unit.f45918a;
                    V2.b.b();
                } finally {
                    V2.b.b();
                }
            } else {
                producer.b(A(), settableProducerContext);
            }
            Unit unit5 = Unit.f45918a;
        } catch (Throwable th3) {
            V2.b.b();
            throw th3;
        }
    }

    private final InterfaceC1260n A() {
        return new C0036a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void D() {
        k.i(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(Throwable th) {
        if (super.q(th, B(this.f2547h))) {
            this.f2548i.i(this.f2547h, th);
        }
    }

    protected final Map B(e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        return producerContext.getExtras();
    }

    public final l0 C() {
        return this.f2547h;
    }

    protected void F(Object obj, int i10, e0 producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        boolean zD = AbstractC1249c.d(i10);
        if (super.u(obj, zD, B(producerContext)) && zD) {
            this.f2548i.e(this.f2547h);
        }
    }

    @Override // p083i2.a, p083i2.c
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.c()) {
            return true;
        }
        this.f2548i.g(this.f2547h);
        this.f2547h.g();
        return true;
    }
}
