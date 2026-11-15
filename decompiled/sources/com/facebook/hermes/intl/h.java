package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;

/* JADX INFO: loaded from: classes.dex */
public class h implements com.facebook.hermes.intl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RuleBasedCollator f13918a = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f13920b;

        static {
            int[] iArr = new int[com.facebook.hermes.intl.a.b.values().length];
            f13920b = iArr;
            try {
                iArr[com.facebook.hermes.intl.a.b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13920b[com.facebook.hermes.intl.a.b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13920b[com.facebook.hermes.intl.a.b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.facebook.hermes.intl.a.c.values().length];
            f13919a = iArr2;
            try {
                iArr2[com.facebook.hermes.intl.a.c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13919a[com.facebook.hermes.intl.a.c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13919a[com.facebook.hermes.intl.a.c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13919a[com.facebook.hermes.intl.a.c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    h() {
    }

    @Override // com.facebook.hermes.intl.a
    public int a(String str, String str2) {
        return this.f13918a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a.c b() {
        RuleBasedCollator ruleBasedCollator = this.f13918a;
        if (ruleBasedCollator == null) {
            return com.facebook.hermes.intl.a.c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            return this.f13918a.isCaseLevel() ? com.facebook.hermes.intl.a.c.CASE : com.facebook.hermes.intl.a.c.BASE;
        }
        return strength == 1 ? com.facebook.hermes.intl.a.c.ACCENT : com.facebook.hermes.intl.a.c.VARIANT;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a c(boolean z9) {
        if (z9) {
            this.f13918a.setAlternateHandlingShifted(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a d(com.facebook.hermes.intl.a.b bVar) {
        int i10 = a.f13920b[bVar.ordinal()];
        if (i10 == 1) {
            this.f13918a.setUpperCaseFirst(true);
            return this;
        }
        if (i10 != 2) {
            this.f13918a.setCaseFirstDefault();
            return this;
        }
        this.f13918a.setLowerCaseFirst(true);
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a e(boolean z9) {
        if (z9) {
            this.f13918a.setNumericCollation(B2.d.e(Boolean.TRUE));
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a f(B2.b bVar) {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) android.icu.text.Collator.getInstance(((B2.h) bVar).getLocale());
        this.f13918a = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a g(com.facebook.hermes.intl.a.c cVar) {
        int i10 = a.f13919a[cVar.ordinal()];
        if (i10 == 1) {
            this.f13918a.setStrength(0);
            return this;
        }
        if (i10 == 2) {
            this.f13918a.setStrength(1);
            return this;
        }
        if (i10 == 3) {
            this.f13918a.setStrength(0);
            this.f13918a.setCaseLevel(true);
            return this;
        }
        if (i10 != 4) {
            return this;
        }
        this.f13918a.setStrength(2);
        return this;
    }
}
