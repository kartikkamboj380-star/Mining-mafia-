package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
class n implements Spannable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f9793a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Spannable f9794b;

    private static class a {
        static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    static class b {
        b() {
        }

        boolean a(CharSequence charSequence) {
            return charSequence instanceof M.m;
        }
    }

    static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.n.b
        boolean a(CharSequence charSequence) {
            return p031d0.e.a(charSequence) || (charSequence instanceof M.m);
        }
    }

    n(Spannable spannable) {
        this.f9794b = spannable;
    }

    private void a() {
        Spannable spannable = this.f9794b;
        if (!this.f9793a && c().a(spannable)) {
            this.f9794b = new SpannableString(spannable);
        }
        this.f9793a = true;
    }

    static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    Spannable b() {
        return this.f9794b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f9794b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f9794b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f9794b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f9794b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f9794b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f9794b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i10, int i11, Class cls) {
        return this.f9794b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f9794b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f9794b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f9794b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f9794b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f9794b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f9794b.toString();
    }

    n(CharSequence charSequence) {
        this.f9794b = new SpannableString(charSequence);
    }
}
