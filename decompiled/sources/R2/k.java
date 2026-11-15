package R2;

import android.util.SparseArray;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final SparseArray f5143a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f5144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a f5145c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f5146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f5147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinkedList f5148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f5149d;

        public String toString() {
            return "LinkedEntry(key: " + this.f5147b + ")";
        }

        private a(a aVar, int i10, LinkedList linkedList, a aVar2) {
            this.f5146a = aVar;
            this.f5147b = i10;
            this.f5148c = linkedList;
            this.f5149d = aVar2;
        }
    }

    private void b(a aVar) {
        if (aVar == null || !aVar.f5148c.isEmpty()) {
            return;
        }
        d(aVar);
        this.f5143a.remove(aVar.f5147b);
    }

    private void c(a aVar) {
        if (this.f5144b == aVar) {
            return;
        }
        d(aVar);
        a aVar2 = this.f5144b;
        if (aVar2 == null) {
            this.f5144b = aVar;
            this.f5145c = aVar;
        } else {
            aVar.f5149d = aVar2;
            aVar2.f5146a = aVar;
            this.f5144b = aVar;
        }
    }

    private synchronized void d(a aVar) {
        try {
            a aVar2 = aVar.f5146a;
            a aVar3 = aVar.f5149d;
            if (aVar2 != null) {
                aVar2.f5149d = aVar3;
            }
            if (aVar3 != null) {
                aVar3.f5146a = aVar2;
            }
            aVar.f5146a = null;
            aVar.f5149d = null;
            if (aVar == this.f5144b) {
                this.f5144b = aVar3;
            }
            if (aVar == this.f5145c) {
                this.f5145c = aVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object a(int i10) {
        a aVar = (a) this.f5143a.get(i10);
        if (aVar == null) {
            return null;
        }
        Object objPollFirst = aVar.f5148c.pollFirst();
        c(aVar);
        return objPollFirst;
    }

    public synchronized void e(int i10, Object obj) {
        try {
            a aVar = (a) this.f5143a.get(i10);
            if (aVar == null) {
                a aVar2 = new a(null, i10, new LinkedList(), null);
                this.f5143a.put(i10, aVar2);
                aVar = aVar2;
            }
            aVar.f5148c.addLast(obj);
            c(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object f() {
        a aVar = this.f5145c;
        if (aVar == null) {
            return null;
        }
        Object objPollLast = aVar.f5148c.pollLast();
        b(aVar);
        return objPollLast;
    }
}
