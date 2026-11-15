package Q4;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.C5420ur;
import com.google.android.gms.internal.ads.EnumC5746xR;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4845b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5420ur f4847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bundle f4848e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f4850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f4851h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4846c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f4849f = new Bundle();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    public M(JsonReader jsonReader, C5420ur c5420ur) throws IOException {
        Bundle bundle;
        byte b10;
        this.f4850g = -1L;
        this.f4851h = -1L;
        this.f4847d = c5420ur;
        HashMap map = new HashMap();
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            switch (strNextName == null ? "" : strNextName) {
                case "start_time":
                    b10 = 2;
                    break;
                case "params":
                    b10 = 0;
                    break;
                case "signal_dictionary":
                    b10 = 1;
                    break;
                case "end_time":
                    b10 = 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                strNextString = jsonReader.nextString();
            } else if (b10 == 1) {
                map = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    map.put(jsonReader.nextName(), jsonReader.nextString());
                }
                jsonReader.endObject();
            } else if (b10 == 2) {
                this.f4850g = jsonReader.nextLong();
            } else if (b10 != 3) {
                jsonReader.skipValue();
            } else {
                this.f4851h = jsonReader.nextLong();
            }
        }
        this.f4844a = strNextString;
        jsonReader.endObject();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f4849f.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f29602K2)).booleanValue() || c5420ur == null || (bundle = c5420ur.f33920m) == null) {
            return;
        }
        bundle.putLong(EnumC5746xR.GET_SIGNALS_SDKCORE_START.c(), this.f4850g);
        c5420ur.f33920m.putLong(EnumC5746xR.GET_SIGNALS_SDKCORE_END.c(), this.f4851h);
    }
}
