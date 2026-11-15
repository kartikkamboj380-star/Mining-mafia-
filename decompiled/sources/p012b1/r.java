package p012b1;

import android.content.Context;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.protobuf.CodedOutputStream;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import p032d1.g;
import p082i1.d;
import p132n1.f;
import p192t1.AbstractC7126d;

/* JADX INFO: loaded from: classes.dex */
public interface r {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f11537a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f.b f11538b = f.b.f46607p;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Lazy f11539c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Lazy f11540d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private j.c f11541e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private h f11542f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final l.a f11543g = new l.a();

        public a(Context context) {
            this.f11537a = AbstractC7126d.b(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d d(a aVar) {
            return d.a.d(new d.a(), aVar.f11537a, 0.0d, 2, null).b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p032d1.a e() {
            return g.d();
        }

        public final r c() {
            Context context = this.f11537a;
            f.b bVar = this.f11538b;
            f.b bVarA = bVar.a((8191 & 1) != 0 ? bVar.f46608a : null, (8191 & 2) != 0 ? bVar.f46609b : null, (8191 & 4) != 0 ? bVar.f46610c : null, (8191 & 8) != 0 ? bVar.f46611d : null, (8191 & 16) != 0 ? bVar.f46612e : null, (8191 & 32) != 0 ? bVar.f46613f : null, (8191 & 64) != 0 ? bVar.f46614g : null, (8191 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? bVar.f46615h : null, (8191 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f46616i : null, (8191 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f46617j : null, (8191 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f46618k : null, (8191 & 2048) != 0 ? bVar.f46619l : null, (8191 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? bVar.f46620m : null, (8191 & 8192) != 0 ? bVar.f46621n : this.f11543g.a());
            Lazy lazyA = this.f11539c;
            if (lazyA == null) {
                lazyA = p129m8.g.a(new Function0() { // from class: b1.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.a.d(this.f11536a);
                    }
                });
            }
            Lazy lazyA2 = this.f11540d;
            if (lazyA2 == null) {
                lazyA2 = p129m8.g.a(new Function0() { // from class: b1.q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.a.e();
                    }
                });
            }
            j.c cVar = this.f11541e;
            if (cVar == null) {
                cVar = j.c.f11527b;
            }
            h hVar = this.f11542f;
            if (hVar == null) {
                hVar = new h();
            }
            return new v(new v.a(context, bVarA, lazyA, lazyA2, cVar, hVar, null));
        }

        public final a f(h hVar) {
            this.f11542f = hVar;
            return this;
        }
    }

    f.b a();

    p032d1.a b();

    p132n1.d c(f fVar);

    d d();

    h getComponents();
}
