package p201u0;

import I8.C0687p;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.n;
import p169q8.b;
import p191t0.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class F extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TopicsManager f49750b;

    static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f49751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f49752b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f49754d;

        a(b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f49752b = obj;
            this.f49754d |= LinearLayoutManager.INVALID_OFFSET;
            return F.e(F.this, null, this);
        }
    }

    public F(TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.f49750b = mTopicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object e(F f10, C7136b c7136b, b bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f49754d;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f49754d = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                aVar = f10.new a(bVar);
            }
        } else {
            aVar = f10.new a(bVar);
        }
        Object objF = aVar.f49752b;
        Object objE = p179r8.b.e();
        int i11 = aVar.f49754d;
        if (i11 == 0) {
            n.b(objF);
            GetTopicsRequest getTopicsRequestC = f10.c(c7136b);
            aVar.f49751a = f10;
            aVar.f49754d = 1;
            objF = f10.f(getTopicsRequestC, aVar);
            if (objF == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = (F) aVar.f49751a;
            n.b(objF);
        }
        return f10.d(D.a(objF));
    }

    private final Object f(GetTopicsRequest getTopicsRequest, b bVar) {
        C0687p c0687p = new C0687p(p179r8.b.c(bVar), 1);
        c0687p.G();
        this.f49750b.getTopics(getTopicsRequest, new j(), K.n.a(c0687p));
        Object objA = c0687p.A();
        if (objA == p179r8.b.e()) {
            h.c(bVar);
        }
        return objA;
    }

    @Override // p201u0.u
    @Nullable
    public Object a(@NotNull C7136b c7136b, @NotNull b bVar) {
        return e(this, c7136b, bVar);
    }

    public GetTopicsRequest c(C7136b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return g.f49762a.b(request);
    }

    public h d(GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return s.f49765a.a(response);
    }
}
