package p017b6;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import p037d6.a;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f11620g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final DateFormat f11621h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f11624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f11625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f11626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f11627f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f11622a = str;
        this.f11623b = str2;
        this.f11624c = str3;
        this.f11625d = date;
        this.f11626e = j10;
        this.f11627f = j11;
    }

    static b a(a.c cVar) {
        String str = cVar.f43140d;
        if (str == null) {
            str = "";
        }
        return new b(cVar.f43138b, String.valueOf(cVar.f43139c), str, new Date(cVar.f43149m), cVar.f43141e, cVar.f43146j);
    }

    static b b(Map map) throws a {
        g(map);
        try {
            return new b((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", f11621h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis")));
        } catch (NumberFormatException e10) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e10);
        } catch (ParseException e11) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e11);
        }
    }

    private static void g(Map map) throws a {
        ArrayList arrayList = new ArrayList();
        for (String str : f11620g) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    String c() {
        return this.f11622a;
    }

    long d() {
        return this.f11625d.getTime();
    }

    String e() {
        return this.f11623b;
    }

    a.c f(String str) {
        a.c cVar = new a.c();
        cVar.f43137a = str;
        cVar.f43149m = d();
        cVar.f43138b = this.f11622a;
        cVar.f43139c = this.f11623b;
        cVar.f43140d = TextUtils.isEmpty(this.f11624c) ? null : this.f11624c;
        cVar.f43141e = this.f11626e;
        cVar.f43146j = this.f11627f;
        return cVar;
    }
}
