package s9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.collections.C7023i;
import kotlin.jvm.internal.Intrinsics;
import r9.AbstractC7112o;
import r9.C7111n;
import r9.T;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final void a(AbstractC7112o abstractC7112o, T dir, boolean z9) {
        Intrinsics.checkNotNullParameter(abstractC7112o, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        C7023i c7023i = new C7023i();
        for (T tI = dir; tI != null && !abstractC7112o.j(tI); tI = tI.i()) {
            c7023i.addFirst(tI);
        }
        if (z9 && c7023i.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = c7023i.iterator();
        while (it.hasNext()) {
            abstractC7112o.f((T) it.next());
        }
    }

    public static final boolean b(AbstractC7112o abstractC7112o, T path) {
        Intrinsics.checkNotNullParameter(abstractC7112o, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return abstractC7112o.m(path) != null;
    }

    public static final C7111n c(AbstractC7112o abstractC7112o, T path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(abstractC7112o, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        C7111n c7111nM = abstractC7112o.m(path);
        if (c7111nM != null) {
            return c7111nM;
        }
        throw new FileNotFoundException("no such file: " + path);
    }
}
