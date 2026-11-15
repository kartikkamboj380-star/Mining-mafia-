package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.util.JsonReader;
import app.notifee.core.event.LogEvent;
import com.google.android.gms.common.util.IOUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.qb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4886qb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3880ib0 f32672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f32673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f32674d;

    C4886qb0(JsonReader jsonReader, Bundle bundle) throws IOException {
        this.f32674d = bundle;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29602K2)).booleanValue() && bundle != null) {
            bundle.putLong(EnumC5746xR.SERVER_RESPONSE_PARSE_START.c(), G4.t.o().currentTimeMillis());
        }
        List arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        C3880ib0 c3880ib0 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new C3502fb0(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        c3880ib0 = new C3880ib0(jsonReader);
                        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29612L2)).booleanValue() && bundle != null) {
                            bundle.putLong(EnumC5746xR.NORMALIZATION_AD_RESPONSE_START.c(), c3880ib0.f29472s);
                            bundle.putLong(EnumC5746xR.NORMALIZATION_AD_RESPONSE_END.c(), c3880ib0.f29473t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectD = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if (MediationMetaData.KEY_NAME.equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if (LogEvent.LEVEL_INFO.equals(strNextName3)) {
                            jSONObjectD = K4.S.d(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new C4760pb0(strNextString, jSONObjectD));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f32673c = arrayList2;
        this.f32671a = arrayList;
        this.f32672b = c3880ib0 == null ? new C3880ib0(new JsonReader(new StringReader("{}"))) : c3880ib0;
    }

    public static C4886qb0 a(Reader reader, Bundle bundle) {
        try {
            try {
                C4886qb0 c4886qb0 = new C4886qb0(new JsonReader(reader), bundle);
                IOUtils.closeQuietly(reader);
                return c4886qb0;
            } catch (Throwable th) {
                IOUtils.closeQuietly(reader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e10) {
            throw new C4004jb0("unable to parse ServerResponse", e10);
        }
    }
}
