package androidx.emoji2.text;

import K.o;
import android.graphics.Typeface;
import android.util.SparseArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p041e0.b f9783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f9784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f9785c = new a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Typeface f9786d;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f9787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private m f9788b;

        private a() {
            this(1);
        }

        a a(int i10) {
            SparseArray sparseArray = this.f9787a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i10);
        }

        final m b() {
            return this.f9788b;
        }

        void c(m mVar, int i10, int i11) {
            a aVarA = a(mVar.b(i10));
            if (aVarA == null) {
                aVarA = new a();
                this.f9787a.put(mVar.b(i10), aVarA);
            }
            if (i11 > i10) {
                aVarA.c(mVar, i10 + 1, i11);
            } else {
                aVarA.f9788b = mVar;
            }
        }

        a(int i10) {
            this.f9787a = new SparseArray(i10);
        }
    }

    private l(Typeface typeface, p041e0.b bVar) {
        this.f9786d = typeface;
        this.f9783a = bVar;
        this.f9784b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(p041e0.b bVar) {
        int iK = bVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            m mVar = new m(this, i10);
            Character.toChars(mVar.f(), this.f9784b, i10 * 2);
            h(mVar);
        }
    }

    public static l b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            o.a("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.b(byteBuffer));
        } finally {
            o.b();
        }
    }

    public char[] c() {
        return this.f9784b;
    }

    public p041e0.b d() {
        return this.f9783a;
    }

    int e() {
        return this.f9783a.l();
    }

    a f() {
        return this.f9785c;
    }

    Typeface g() {
        return this.f9786d;
    }

    void h(m mVar) {
        N.f.h(mVar, "emoji metadata cannot be null");
        N.f.b(mVar.c() > 0, "invalid metadata codepoint length");
        this.f9785c.c(mVar, 0, mVar.c() - 1);
    }
}
