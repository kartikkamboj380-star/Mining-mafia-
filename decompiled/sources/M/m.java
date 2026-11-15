package M;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Spannable {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f3434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f3435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f3437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f3438e;

        /* JADX INFO: renamed from: M.m$a$a, reason: collision with other inner class name */
        public static class C0055a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f3439a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f3441c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f3442d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f3440b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0055a(TextPaint textPaint) {
                this.f3439a = textPaint;
            }

            public a a() {
                return new a(this.f3439a, this.f3440b, this.f3441c, this.f3442d);
            }

            public C0055a b(int i10) {
                this.f3441c = i10;
                return this;
            }

            public C0055a c(int i10) {
                this.f3442d = i10;
                return this;
            }

            public C0055a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3440b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3438e = l.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f3438e = null;
            }
            this.f3434a = textPaint;
            this.f3435b = textDirectionHeuristic;
            this.f3436c = i10;
            this.f3437d = i11;
        }

        public boolean a(a aVar) {
            if (this.f3436c != aVar.b() || this.f3437d != aVar.c() || this.f3434a.getTextSize() != aVar.e().getTextSize() || this.f3434a.getTextScaleX() != aVar.e().getTextScaleX() || this.f3434a.getTextSkewX() != aVar.e().getTextSkewX() || this.f3434a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f3434a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f3434a.getFlags() != aVar.e().getFlags() || !this.f3434a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f3434a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f3434a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f3436c;
        }

        public int c() {
            return this.f3437d;
        }

        public TextDirectionHeuristic d() {
            return this.f3435b;
        }

        public TextPaint e() {
            return this.f3434a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f3435b == aVar.d();
        }

        public int hashCode() {
            return N.b.b(Float.valueOf(this.f3434a.getTextSize()), Float.valueOf(this.f3434a.getTextScaleX()), Float.valueOf(this.f3434a.getTextSkewX()), Float.valueOf(this.f3434a.getLetterSpacing()), Integer.valueOf(this.f3434a.getFlags()), this.f3434a.getTextLocales(), this.f3434a.getTypeface(), Boolean.valueOf(this.f3434a.isElegantTextHeight()), this.f3435b, Integer.valueOf(this.f3436c), Integer.valueOf(this.f3437d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f3434a.getTextSize());
            sb.append(", textScaleX=" + this.f3434a.getTextScaleX());
            sb.append(", textSkewX=" + this.f3434a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f3434a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f3434a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f3434a.getTextLocales());
            sb.append(", typeface=" + this.f3434a.getTypeface());
            if (i10 >= 26) {
                sb.append(", variationSettings=" + this.f3434a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f3435b);
            sb.append(", breakStrategy=" + this.f3436c);
            sb.append(", hyphenationFrequency=" + this.f3437d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f3434a = params.getTextPaint();
            this.f3435b = params.getTextDirection();
            this.f3436c = params.getBreakStrategy();
            this.f3437d = params.getHyphenationFrequency();
            this.f3438e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
