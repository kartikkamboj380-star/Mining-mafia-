package com.bytedance.sdk.openadsdk.core.vvw.oq;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq extends bob implements Comparable<kq> {
    public long kq;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.vvw.oq.kq$kq, reason: collision with other inner class name */
    public static class C0291kq {
        private bob.EnumC0290bob bob = bob.EnumC0290bob.TRACKING_URL;
        private final String kq;
        private final long oq;

        public C0291kq(String str, long j10) {
            this.kq = str;
            this.oq = j10;
        }

        public kq kq() {
            return new kq(this.oq, this.kq, this.bob, Boolean.FALSE);
        }
    }

    protected kq(long j10, String str, bob.EnumC0290bob enumC0290bob, Boolean bool) {
        super(str, enumC0290bob, bool);
        this.kq = j10;
    }

    public long kq() {
        return this.kq;
    }

    public JSONObject oq() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, bob());
        jSONObject.put("trackingMilliseconds", this.kq);
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    public static int kq(String str) {
        if (TextUtils.isEmpty(str)) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Integer.parseInt(strArrSplit[0]) * 3600000) + (Integer.parseInt(strArrSplit[1]) * 60000) + (Float.parseFloat(strArrSplit[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return LinearLayoutManager.INVALID_OFFSET;
    }

    public boolean kq(long j10) {
        return this.kq <= j10 && !csi();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
    public int compareTo(kq kqVar) {
        if (kqVar == null) {
            return 1;
        }
        long j10 = this.kq;
        long j11 = kqVar.kq;
        if (j10 > j11) {
            return 1;
        }
        return j10 < j11 ? -1 : 0;
    }
}
