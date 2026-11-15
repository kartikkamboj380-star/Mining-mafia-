package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.emoji2.text.e.j f9752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f9753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.emoji2.text.e.InterfaceC0154e f9754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f9755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f9756e;

    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z9 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z9 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z9) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z9 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z9 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z9) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z9) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z9 = true;
                    }
                }
                return i10;
            }
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n f9757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.emoji2.text.e.j f9758b;

        b(n nVar, androidx.emoji2.text.e.j jVar) {
            this.f9757a = nVar;
            this.f9758b = jVar;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i10, int i11, m mVar) {
            if (mVar.k()) {
                return true;
            }
            if (this.f9757a == null) {
                this.f9757a = new n(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f9757a.setSpan(this.f9758b.a(mVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public n a() {
            return this.f9757a;
        }
    }

    private interface c {
        Object a();

        boolean b(CharSequence charSequence, int i10, int i11, m mVar);
    }

    private static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9759a;

        d(String str) {
            this.f9759a = str;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean b(CharSequence charSequence, int i10, int i11, m mVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f9759a)) {
                return true;
            }
            mVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public d a() {
            return this;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9760a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l.a f9761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private l.a f9762c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private l.a f9763d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f9764e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f9765f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f9766g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f9767h;

        e(l.a aVar, boolean z9, int[] iArr) {
            this.f9761b = aVar;
            this.f9762c = aVar;
            this.f9766g = z9;
            this.f9767h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f9760a = 1;
            this.f9762c = this.f9761b;
            this.f9765f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f9762c.b().j() || d(this.f9764e)) {
                return true;
            }
            if (this.f9766g) {
                if (this.f9767h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f9767h, this.f9762c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            l.a aVarA = this.f9762c.a(i10);
            int iG = 2;
            if (this.f9760a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f9760a = 2;
                    this.f9762c = aVarA;
                    this.f9765f = 1;
                }
            } else if (aVarA != null) {
                this.f9762c = aVarA;
                this.f9765f++;
            } else if (f(i10)) {
                iG = g();
            } else if (!d(i10)) {
                if (this.f9762c.b() != null) {
                    iG = 3;
                    if (this.f9765f != 1 || h()) {
                        this.f9763d = this.f9762c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f9764e = i10;
            return iG;
        }

        m b() {
            return this.f9762c.b();
        }

        m c() {
            return this.f9763d.b();
        }

        boolean e() {
            if (this.f9760a != 2 || this.f9762c.b() == null) {
                return false;
            }
            return this.f9765f > 1 || h();
        }
    }

    h(l lVar, androidx.emoji2.text.e.j jVar, androidx.emoji2.text.e.InterfaceC0154e interfaceC0154e, boolean z9, int[] iArr, Set set) {
        this.f9752a = jVar;
        this.f9753b = lVar;
        this.f9754c = interfaceC0154e;
        this.f9755d = z9;
        this.f9756e = iArr;
        g(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z9) {
        p031d0.b[] bVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (bVarArr = (p031d0.b[]) editable.getSpans(selectionStart, selectionEnd, p031d0.b.class)) != null && bVarArr.length > 0) {
            for (p031d0.b bVar : bVarArr) {
                int spanStart = editable.getSpanStart(bVar);
                int spanEnd = editable.getSpanEnd(bVar);
                if ((z9 && spanStart == selectionStart) || ((!z9 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z9) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z9) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            p031d0.b[] bVarArr = (p031d0.b[]) editable.getSpans(iMax, iMin, p031d0.b.class);
            if (bVarArr != null && bVarArr.length > 0) {
                for (p031d0.b bVar : bVarArr) {
                    int spanStart = editable.getSpanStart(bVar);
                    int spanEnd = editable.getSpanEnd(bVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean c(Editable editable, int i10, KeyEvent keyEvent) {
        boolean zA;
        if (i10 != 67) {
            zA = i10 != 112 ? false : a(editable, keyEvent, true);
        } else {
            zA = a(editable, keyEvent, false);
        }
        if (!zA) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean d(CharSequence charSequence, int i10, int i11, m mVar) {
        if (mVar.d() == 0) {
            mVar.m(this.f9754c.a(charSequence, i10, i11, mVar.h()));
        }
        return mVar.d() == 2;
    }

    private static boolean e(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    private Object i(CharSequence charSequence, int i10, int i11, int i12, boolean z9, c cVar) {
        int iCharCount;
        e eVar = new e(this.f9753b.f(), this.f9755d, this.f9756e);
        int i13 = 0;
        boolean zB = true;
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        loop0: while (true) {
            iCharCount = i10;
            while (true) {
                if (i10 >= i11 || i13 >= i12 || !zB) {
                    break loop0;
                }
                int iA = eVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iA == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iA != 3) {
                }
            }
            if (z9 || !d(charSequence, iCharCount, i10, eVar.c())) {
                zB = cVar.b(charSequence, iCharCount, i10, eVar.c());
                i13++;
            }
        }
        if (eVar.e() && i13 < i12 && zB && (z9 || !d(charSequence, iCharCount, i10, eVar.b()))) {
            cVar.b(charSequence, iCharCount, i10, eVar.b());
        }
        return cVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x000e, B:10:0x0013, B:12:0x0017, B:14:0x0024, B:22:0x003c, B:24:0x0044, B:26:0x0047, B:28:0x004b, B:30:0x0057, B:31:0x005a, B:41:0x0078), top: B:69:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:? A[SYNTHETIC] */
    CharSequence h(CharSequence charSequence, int i10, int i11, int i12, boolean z9) throws Throwable {
        n nVar;
        CharSequence charSequence2;
        Throwable th;
        int i13;
        int i14;
        p031d0.b[] bVarArr;
        int i15;
        int spanStart;
        boolean z10 = charSequence instanceof p031d0.c;
        if (z10) {
            ((p031d0.c) charSequence).a();
        }
        if (z10) {
            nVar = new n((Spannable) charSequence);
            if (nVar != null) {
                for (p031d0.b bVar : bVarArr) {
                    spanStart = nVar.getSpanStart(bVar);
                    int spanEnd = nVar.getSpanEnd(bVar);
                    if (spanStart != i11) {
                        nVar.removeSpan(bVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 == i14) {
                charSequence2 = charSequence;
                if (!z10) {
                    return charSequence2;
                }
                ((p031d0.c) charSequence2).d();
            } else {
                charSequence2 = charSequence;
                if (!z10) {
                    return charSequence2;
                }
                ((p031d0.c) charSequence2).d();
            }
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    nVar = new n((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z10) {
                        throw th;
                    }
                    ((p031d0.c) charSequence2).d();
                    throw th;
                }
            } else {
                nVar = (!(charSequence instanceof Spanned) || ((Spanned) charSequence).nextSpanTransition(i10 + (-1), i11 + 1, p031d0.b.class) > i11) ? null : new n(charSequence);
            }
            if (nVar != null && (bVarArr = (p031d0.b[]) nVar.getSpans(i10, i11, p031d0.b.class)) != null && bVarArr.length > 0) {
                while (i15 < r5) {
                    spanStart = nVar.getSpanStart(bVar);
                    int spanEnd2 = nVar.getSpanEnd(bVar);
                    if (spanStart != i11) {
                        nVar.removeSpan(bVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd2, i11);
                }
            }
            i13 = i10;
            i14 = i11;
            if (i13 == i14 && i13 < charSequence.length()) {
                if (i12 != Integer.MAX_VALUE && nVar != null) {
                    i12 -= ((p031d0.b[]) nVar.getSpans(0, nVar.length(), p031d0.b.class)).length;
                }
                charSequence2 = charSequence;
                try {
                    n nVar2 = (n) i(charSequence2, i13, i14, i12, z9, new b(nVar, this.f9752a));
                    if (nVar2 == null) {
                        if (z10) {
                        }
                        return charSequence2;
                    }
                    Spannable spannableB = nVar2.b();
                    if (z10) {
                        ((p031d0.c) charSequence2).d();
                    }
                    return spannableB;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z10) {
                        throw th;
                    }
                    ((p031d0.c) charSequence2).d();
                    throw th;
                }
            }
            charSequence2 = charSequence;
            if (!z10) {
                return charSequence2;
            }
            ((p031d0.c) charSequence2).d();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z10) {
            throw th;
        }
        ((p031d0.c) charSequence2).d();
        throw th;
    }
}
