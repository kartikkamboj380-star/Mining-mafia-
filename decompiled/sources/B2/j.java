package B2;

import android.icu.text.Collator;
import android.icu.text.NumberingSystem;
import android.icu.util.Calendar;
import android.icu.util.ULocale;
import com.tenjin.android.utils.adnetwork.TradPlusHelper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f192a = "calendar";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f193b = "ca";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f194c = "numbers";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f195d = "nu";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f196e = "hours";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f197f = "hc";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f198g = "collation";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f199h = "co";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f200i = "colnumeric";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f201j = "kn";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static String f202k = "colcasefirst";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static String f203l = "kf";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static HashMap f204m = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static HashMap f205n = new b();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Map f206o = new c();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static Map f207p = new d();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Map f208q = new e();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Map f209r = new f();

    class a extends HashMap {
        a() {
            put(j.f193b, j.f192a);
            put(j.f195d, j.f194c);
            put(j.f197f, j.f196e);
            put(j.f199h, j.f198g);
            put(j.f201j, j.f200i);
            put(j.f203l, j.f202k);
        }
    }

    class b extends HashMap {
        b() {
            put(j.f192a, j.f193b);
            put(j.f194c, j.f195d);
            put(j.f196e, j.f197f);
            put(j.f198g, j.f199h);
            put(j.f200i, j.f201j);
            put(j.f202k, j.f203l);
        }
    }

    class c extends HashMap {
        c() {
            put("dictionary", "dict");
            put("phonebook", "phonebk");
            put("traditional", "trad");
            put("gb2312han", "gb2312");
        }
    }

    class d extends HashMap {
        d() {
            put("gregorian", "gregory");
        }
    }

    class e extends HashMap {
        e() {
            put("traditional", "traditio");
        }
    }

    class f extends HashMap {
        f() {
            put("nu", new String[]{"adlm", "ahom", "arab", "arabext", "bali", "beng", "bhks", "brah", "cakm", "cham", "deva", "diak", "fullwide", "gong", "gonm", "gujr", "guru", "hanidec", "hmng", "hmnp", "java", "kali", "khmr", "knda", "lana", "lanatham", "laoo", "latn", "lepc", "limb", "mathbold", "mathdbl", "mathmono", "mathsanb", "mathsans", "mlym", "modi", "mong", "mroo", "mtei", "mymr", "mymrshan", "mymrtlng", "newa", "nkoo", "olck", "orya", "osma", "rohg", "saur", TradPlusHelper.KEY_SEGMENT, "shrd", "sind", "sinh", "sora", "sund", "takr", "talu", "tamldec", "telu", "thai", "tibt", "tirh", "vaii", "wara", "wcho"});
            put("co", new String[]{"big5han", "compat", "dict", "direct", "ducet", "emoji", "eor", "gb2312", "phonebk", "phonetic", "pinyin", "reformed", "searchjl", "stroke", "trad", "unihan", "zhuyin"});
            put("ca", new String[]{"buddhist", "chinese", "coptic", "dangi", "ethioaa", "ethiopic", "gregory", "hebrew", "indian", "islamic", "islamic-umalqura", "islamic-tbla", "islamic-civil", "islamic-rgsa", "iso8601", "japanese", "persian", "roc"});
        }
    }

    public static String a(String str) {
        return f204m.containsKey(str) ? (String) f204m.get(str) : str;
    }

    public static String b(String str) {
        return f205n.containsKey(str) ? (String) f205n.get(str) : str;
    }

    public static boolean c(String str, String str2, B2.b bVar) {
        ULocale uLocale = (ULocale) bVar.getLocale();
        String[] availableNames = new String[0];
        if (str.equals("co")) {
            if (str2.equals("standard") || str2.equals("search")) {
                return false;
            }
            availableNames = Collator.getKeywordValuesForLocale("co", uLocale, false);
        } else if (str.equals("ca")) {
            availableNames = Calendar.getKeywordValuesForLocale("ca", uLocale, false);
        } else if (str.equals("nu")) {
            availableNames = NumberingSystem.getAvailableNames();
        }
        if (availableNames.length == 0) {
            return true;
        }
        return Arrays.asList(availableNames).contains(str2);
    }

    public static String d(String str) {
        return !f207p.containsKey(str) ? str : (String) f207p.get(str);
    }

    public static String e(String str) {
        Map map = f206o;
        return !map.containsKey(str) ? str : (String) map.get(str);
    }

    public static Object f(String str, Object obj) {
        if (str.equals("ca") && B2.d.m(obj)) {
            return d((String) obj);
        }
        if (str.equals("nu") && B2.d.m(obj)) {
            return g((String) obj);
        }
        if (str.equals("co") && B2.d.m(obj)) {
            return e((String) obj);
        }
        if (str.equals("kn") && B2.d.m(obj) && obj.equals("yes")) {
            return B2.d.r("true");
        }
        return ((str.equals("kn") || str.equals("kf")) && B2.d.m(obj) && obj.equals("no")) ? B2.d.r("false") : obj;
    }

    public static String g(String str) {
        return !f208q.containsKey(str) ? str : (String) f208q.get(str);
    }
}
