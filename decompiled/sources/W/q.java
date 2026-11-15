package W;

import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q extends C0989n implements P {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f6423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f6424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f6425c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f6427e;

        a(p169q8.b bVar) {
            super(bVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6425c = obj;
            this.f6427e |= LinearLayoutManager.INVALID_OFFSET;
            return q.this.a(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file, E serializer) {
        super(file, serializer);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // W.P
    public Object a(Object obj, p169q8.b bVar) {
        a aVar;
        Closeable closeable;
        FileOutputStream fileOutputStream;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f6427e;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f6427e = i10 - LinearLayoutManager.INVALID_OFFSET;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj2 = aVar.f6425c;
        Object objE = p179r8.b.e();
        int i11 = aVar.f6427e;
        if (i11 == 0) {
            p129m8.n.b(obj2);
            f();
            FileOutputStream fileOutputStream2 = new FileOutputStream(g());
            try {
                E eH = h();
                N n10 = new N(fileOutputStream2);
                aVar.f6423a = fileOutputStream2;
                aVar.f6424b = fileOutputStream2;
                aVar.f6427e = 1;
                if (eH.writeTo(obj, n10, aVar) == objE) {
                    return objE;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th) {
                th = th;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) aVar.f6424b;
            closeable = (Closeable) aVar.f6423a;
            try {
                p129m8.n.b(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    p229w8.c.a(closeable, th);
                    throw th3;
                }
            }
        }
        fileOutputStream.getFD().sync();
        Unit unit = Unit.f45918a;
        p229w8.c.a(closeable, null);
        return Unit.f45918a;
    }
}
