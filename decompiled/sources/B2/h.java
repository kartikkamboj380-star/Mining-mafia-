package B2;

import android.icu.util.ULocale;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ULocale f189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ULocale.Builder f190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f191c;

    private h(ULocale uLocale) {
        this.f190b = null;
        this.f191c = false;
        this.f189a = uLocale;
    }

    public static b h() {
        return new h(ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public static b i(String str) {
        return new h(str);
    }

    public static b j(ULocale uLocale) {
        return new h(uLocale);
    }

    private void k() throws f {
        if (this.f191c) {
            try {
                this.f189a = this.f190b.build();
                this.f191c = false;
            } catch (RuntimeException e10) {
                throw new f(e10.getMessage());
            }
        }
    }

    @Override // B2.b
    public HashMap a() throws f {
        k();
        HashMap map = new HashMap();
        Iterator<String> keywords = this.f189a.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                map.put(j.b(next), this.f189a.getKeywordValue(next));
            }
        }
        return map;
    }

    @Override // B2.b
    public ArrayList b(String str) throws f {
        k();
        String strA = j.a(str);
        ArrayList arrayList = new ArrayList();
        String keywordValue = this.f189a.getKeywordValue(strA);
        if (keywordValue != null && !keywordValue.isEmpty()) {
            Collections.addAll(arrayList, keywordValue.split("-|_"));
        }
        return arrayList;
    }

    @Override // B2.b
    public b d() throws f {
        k();
        return new h(this.f189a);
    }

    @Override // B2.b
    public String e() {
        return c().toLanguageTag();
    }

    @Override // B2.b
    public void f(String str, ArrayList arrayList) throws f {
        k();
        if (this.f190b == null) {
            this.f190b = new ULocale.Builder().setLocale(this.f189a);
        }
        try {
            this.f190b.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.f191c = true;
        } catch (RuntimeException e10) {
            throw new f(e10.getMessage());
        }
    }

    @Override // B2.b
    public String g() {
        return getLocale().toLanguageTag();
    }

    @Override // B2.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public ULocale getLocale() throws f {
        k();
        return this.f189a;
    }

    @Override // B2.b
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public ULocale c() throws f {
        k();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.f189a);
        builder.clearExtensions();
        return builder.build();
    }

    private h(String str) throws f {
        this.f189a = null;
        this.f190b = null;
        this.f191c = false;
        ULocale.Builder builder = new ULocale.Builder();
        this.f190b = builder;
        try {
            builder.setLanguageTag(str);
            this.f191c = true;
        } catch (RuntimeException e10) {
            throw new f(e10.getMessage());
        }
    }
}
