package com.facebook.hermes.intl;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import android.os.Build;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Format f13924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.icu.text.NumberFormat f13925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private B2.h f13926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c.h f13927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MeasureUnit f13928e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13929a;

        static {
            int[] iArr = new int[c.g.values().length];
            f13929a = iArr;
            try {
                iArr[c.g.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13929a[c.g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13929a[c.g.EXCEPTZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    j() {
    }

    public static int n(String str) throws B2.f {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new B2.f("Invalid currency code !");
        }
    }

    private void o(android.icu.text.NumberFormat numberFormat, B2.b bVar, c.h hVar) {
        this.f13925b = numberFormat;
        this.f13924a = numberFormat;
        this.f13926c = (B2.h) bVar;
        this.f13927d = hVar;
        numberFormat.setRoundingMode(4);
    }

    private static MeasureUnit p(String str) throws B2.f {
        for (MeasureUnit measureUnit : MeasureUnit.getAvailable()) {
            if (!measureUnit.getSubtype().equals(str)) {
                if (measureUnit.getSubtype().equals(measureUnit.getType() + "-" + str)) {
                }
            }
            return measureUnit;
        }
        throw new B2.f("Unknown unit: " + str);
    }

    @Override // com.facebook.hermes.intl.c
    public AttributedCharacterIterator a(double d10) {
        try {
            try {
                Format format = this.f13924a;
                return (!(format instanceof MeasureFormat) || this.f13928e == null) ? format.formatToCharacterIterator(Double.valueOf(d10)) : format.formatToCharacterIterator(new Measure(Double.valueOf(d10), this.f13928e));
            } catch (RuntimeException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d10));
            }
        } catch (NumberFormatException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).formatToCharacterIterator(Double.valueOf(d10));
        } catch (Exception unused3) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).formatToCharacterIterator(Double.valueOf(d10));
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String b(B2.b bVar) {
        return NumberingSystem.getInstance((ULocale) bVar.getLocale()).getName();
    }

    @Override // com.facebook.hermes.intl.c
    public String c(double d10) {
        try {
            try {
                Format format = this.f13924a;
                return (!(format instanceof MeasureFormat) || this.f13928e == null) ? format.format(Double.valueOf(d10)) : format.format(new Measure(Double.valueOf(d10), this.f13928e));
            } catch (NumberFormatException unused) {
                return android.icu.text.NumberFormat.getInstance(ULocale.getDefault()).format(d10);
            }
        } catch (RuntimeException unused2) {
            return android.icu.text.NumberFormat.getInstance(ULocale.forLanguageTag("en")).format(d10);
        }
    }

    @Override // com.facebook.hermes.intl.c
    public String k(AttributedCharacterIterator.Attribute attribute, double d10) {
        if (attribute == android.icu.text.NumberFormat.Field.SIGN) {
            return Double.compare(d10, 0.0d) >= 0 ? "plusSign" : "minusSign";
        }
        if (attribute == android.icu.text.NumberFormat.Field.INTEGER) {
            if (Double.isNaN(d10)) {
                return "nan";
            }
            return Double.isInfinite(d10) ? "infinity" : "integer";
        }
        if (attribute == android.icu.text.NumberFormat.Field.FRACTION) {
            return "fraction";
        }
        if (attribute == android.icu.text.NumberFormat.Field.EXPONENT) {
            return "exponentInteger";
        }
        if (attribute == android.icu.text.NumberFormat.Field.EXPONENT_SIGN) {
            return "exponentMinusSign";
        }
        if (attribute == android.icu.text.NumberFormat.Field.EXPONENT_SYMBOL) {
            return "exponentSeparator";
        }
        if (attribute == android.icu.text.NumberFormat.Field.DECIMAL_SEPARATOR) {
            return "decimal";
        }
        if (attribute == android.icu.text.NumberFormat.Field.GROUPING_SEPARATOR) {
            return "group";
        }
        if (attribute == android.icu.text.NumberFormat.Field.PERCENT) {
            return "percentSign";
        }
        if (attribute == android.icu.text.NumberFormat.Field.PERMILLE) {
            return "permilleSign";
        }
        if (attribute == android.icu.text.NumberFormat.Field.CURRENCY) {
            return "currency";
        }
        return attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)") ? "compact" : "literal";
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public j l(B2.b bVar, String str, c.h hVar, c.d dVar, c.e eVar, c.b bVar2) throws B2.f {
        if (!str.isEmpty()) {
            try {
                if (NumberingSystem.getInstanceByName(B2.d.h(str)) == null) {
                    throw new B2.f("Invalid numbering system: " + str);
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(B2.d.h(str));
                bVar.f("nu", arrayList);
            } catch (RuntimeException unused) {
                throw new B2.f("Invalid numbering system: " + str);
            }
        }
        if (eVar == c.e.COMPACT && (hVar == c.h.DECIMAL || hVar == c.h.UNIT)) {
            o(CompactDecimalFormat.getInstance((ULocale) bVar.getLocale(), bVar2 == c.b.SHORT ? CompactDecimalFormat.CompactStyle.SHORT : CompactDecimalFormat.CompactStyle.LONG), bVar, hVar);
            return this;
        }
        android.icu.text.NumberFormat numberFormat = android.icu.text.NumberFormat.getInstance((ULocale) bVar.getLocale(), hVar.d(eVar, dVar));
        if (eVar == c.e.ENGINEERING) {
            numberFormat.setMaximumIntegerDigits(3);
        }
        o(numberFormat, bVar, hVar);
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public j d(String str, c.EnumC0323c enumC0323c) {
        if (this.f13927d == c.h.CURRENCY) {
            Currency currency = Currency.getInstance(str);
            this.f13925b.setCurrency(currency);
            if (enumC0323c != c.EnumC0323c.CODE) {
                str = currency.getName(this.f13926c.getLocale(), enumC0323c.d(), (boolean[]) null);
            }
            android.icu.text.NumberFormat numberFormat = this.f13925b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public j h(c.f fVar, int i10, int i11) {
        if (fVar == c.f.FRACTION_DIGITS) {
            if (i10 >= 0) {
                this.f13925b.setMinimumFractionDigits(i10);
            }
            if (i11 >= 0) {
                this.f13925b.setMaximumFractionDigits(i11);
            }
            android.icu.text.NumberFormat numberFormat = this.f13925b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public j g(boolean z9) {
        this.f13925b.setGroupingUsed(z9);
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public j f(int i10) {
        if (i10 != -1) {
            this.f13925b.setMinimumIntegerDigits(i10);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public j j(c.g gVar) {
        android.icu.text.NumberFormat numberFormat = this.f13925b;
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            if (Build.VERSION.SDK_INT >= 31) {
                int i10 = a.f13929a[gVar.ordinal()];
                if (i10 == 1) {
                    decimalFormat.setSignAlwaysShown(false);
                    return this;
                }
                if (i10 == 2 || i10 == 3) {
                    decimalFormat.setSignAlwaysShown(true);
                    return this;
                }
            } else {
                int i11 = a.f13929a[gVar.ordinal()];
                if (i11 == 1) {
                    decimalFormat.setPositivePrefix("");
                    decimalFormat.setPositiveSuffix("");
                    decimalFormat.setNegativePrefix("");
                    decimalFormat.setNegativeSuffix("");
                } else if (i11 == 2 || i11 == 3) {
                    if (!decimalFormat.getNegativePrefix().isEmpty()) {
                        decimalFormat.setPositivePrefix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                    }
                    if (!decimalFormat.getNegativeSuffix().isEmpty()) {
                        decimalFormat.setPositiveSuffix(new String(new char[]{decimalFormatSymbols.getPlusSign()}));
                        return this;
                    }
                }
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public j e(c.f fVar, int i10, int i11) throws B2.f {
        android.icu.text.NumberFormat numberFormat = this.f13925b;
        if ((numberFormat instanceof DecimalFormat) && fVar == c.f.SIGNIFICANT_DIGITS) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i10 >= 0) {
                decimalFormat.setMinimumSignificantDigits(i10);
            }
            if (i11 >= 0) {
                if (i11 < decimalFormat.getMinimumSignificantDigits()) {
                    throw new B2.f("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                }
                decimalFormat.setMaximumSignificantDigits(i11);
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.c
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public j i(String str, c.i iVar) {
        if (this.f13927d == c.h.UNIT) {
            this.f13928e = p(str);
            this.f13924a = MeasureFormat.getInstance(this.f13926c.getLocale(), iVar.d(), this.f13925b);
        }
        return this;
    }
}
