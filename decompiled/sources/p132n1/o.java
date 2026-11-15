package p132n1;

import android.content.Context;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.Intrinsics;
import p012b1.l;
import p142o1.c;
import p142o1.e;
import p142o1.f;
import r9.AbstractC7112o;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f46650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f46651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f46652c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f46653d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f46654e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AbstractC7112o f46655f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f46656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f46657h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c f46658i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l f46659j;

    public o(Context context, f fVar, e eVar, c cVar, String str, AbstractC7112o abstractC7112o, c cVar2, c cVar3, c cVar4, l lVar) {
        this.f46650a = context;
        this.f46651b = fVar;
        this.f46652c = eVar;
        this.f46653d = cVar;
        this.f46654e = str;
        this.f46655f = abstractC7112o;
        this.f46656g = cVar2;
        this.f46657h = cVar3;
        this.f46658i = cVar4;
        this.f46659j = lVar;
    }

    public static /* synthetic */ o b(o oVar, Context context, f fVar, e eVar, c cVar, String str, AbstractC7112o abstractC7112o, c cVar2, c cVar3, c cVar4, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = oVar.f46650a;
        }
        if ((i10 & 2) != 0) {
            fVar = oVar.f46651b;
        }
        if ((i10 & 4) != 0) {
            eVar = oVar.f46652c;
        }
        if ((i10 & 8) != 0) {
            cVar = oVar.f46653d;
        }
        if ((i10 & 16) != 0) {
            str = oVar.f46654e;
        }
        if ((i10 & 32) != 0) {
            abstractC7112o = oVar.f46655f;
        }
        if ((i10 & 64) != 0) {
            cVar2 = oVar.f46656g;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
            cVar3 = oVar.f46657h;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
            cVar4 = oVar.f46658i;
        }
        if ((i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
            lVar = oVar.f46659j;
        }
        c cVar5 = cVar4;
        l lVar2 = lVar;
        c cVar6 = cVar2;
        c cVar7 = cVar3;
        String str2 = str;
        AbstractC7112o abstractC7112o2 = abstractC7112o;
        return oVar.a(context, fVar, eVar, cVar, str2, abstractC7112o2, cVar6, cVar7, cVar5, lVar2);
    }

    public final o a(Context context, f fVar, e eVar, c cVar, String str, AbstractC7112o abstractC7112o, c cVar2, c cVar3, c cVar4, l lVar) {
        return new o(context, fVar, eVar, cVar, str, abstractC7112o, cVar2, cVar3, cVar4, lVar);
    }

    public final Context c() {
        return this.f46650a;
    }

    public final String d() {
        return this.f46654e;
    }

    public final c e() {
        return this.f46657h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.b(this.f46650a, oVar.f46650a) && Intrinsics.b(this.f46651b, oVar.f46651b) && this.f46652c == oVar.f46652c && this.f46653d == oVar.f46653d && Intrinsics.b(this.f46654e, oVar.f46654e) && Intrinsics.b(this.f46655f, oVar.f46655f) && this.f46656g == oVar.f46656g && this.f46657h == oVar.f46657h && this.f46658i == oVar.f46658i && Intrinsics.b(this.f46659j, oVar.f46659j);
    }

    public final l f() {
        return this.f46659j;
    }

    public final AbstractC7112o g() {
        return this.f46655f;
    }

    public final c h() {
        return this.f46658i;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f46650a.hashCode() * 31) + this.f46651b.hashCode()) * 31) + this.f46652c.hashCode()) * 31) + this.f46653d.hashCode()) * 31;
        String str = this.f46654e;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f46655f.hashCode()) * 31) + this.f46656g.hashCode()) * 31) + this.f46657h.hashCode()) * 31) + this.f46658i.hashCode()) * 31) + this.f46659j.hashCode();
    }

    public final c i() {
        return this.f46653d;
    }

    public final e j() {
        return this.f46652c;
    }

    public final f k() {
        return this.f46651b;
    }

    public String toString() {
        return "Options(context=" + this.f46650a + ", size=" + this.f46651b + ", scale=" + this.f46652c + ", precision=" + this.f46653d + ", diskCacheKey=" + this.f46654e + ", fileSystem=" + this.f46655f + ", memoryCachePolicy=" + this.f46656g + ", diskCachePolicy=" + this.f46657h + ", networkCachePolicy=" + this.f46658i + ", extras=" + this.f46659j + ')';
    }
}
