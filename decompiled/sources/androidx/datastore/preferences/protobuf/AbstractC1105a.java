package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1105a implements J {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0149a implements J.a {
        protected static void c(Iterable iterable, List list) {
            AbstractC1124u.a(iterable);
            d(iterable, list);
        }

        private static void d(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static e0 e(J j10) {
            return new e0(j10);
        }
    }

    protected static void a(Iterable iterable, List list) {
        AbstractC0149a.c(iterable, list);
    }

    abstract int c(Y y9);

    e0 d() {
        return new e0(this);
    }

    public void e(OutputStream outputStream) {
        AbstractC1113i abstractC1113iY = AbstractC1113i.Y(outputStream, AbstractC1113i.C(getSerializedSize()));
        b(abstractC1113iY);
        abstractC1113iY.V();
    }
}
