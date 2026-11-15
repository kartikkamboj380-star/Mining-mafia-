package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1492Ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f17435a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f17436b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        String str2;
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f17435a.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb.append(str3);
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!f17436b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb.append(str2);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static String b(C3502fb0 c3502fb0) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29898m6)).booleanValue() && c3502fb0.f28388T) {
            C1553Cb0 c1553Cb0 = c3502fb0.f28390V;
            if (c1553Cb0.b() && c3502fb0.f28397b != 4) {
                EnumC3118cY enumC3118cY = c1553Cb0.c() == 1 ? EnumC3118cY.VIDEO : EnumC3118cY.HTML_DISPLAY;
                String str = c3502fb0.f28418l0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("creativeType", enumC3118cY.toString());
                    jSONObject.put("contentUrl", str);
                    return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                } catch (JSONException e10) {
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.g("Unable to build OMID ENV JSON", e10);
                }
            }
        }
        return null;
    }
}
