package com.bytedance.sdk.openadsdk.uml;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class bob {
    private fou bob;
    private kq fou;
    private oq oq;
    private final String kq = "StrategyCenter";
    private int csi = 0;
    private Runnable rhi = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uml.bob.2
        @Override // java.lang.Runnable
        public void run() {
            bob.this.oq();
        }
    };

    public bob(fou fouVar) {
        this.oq = null;
        csi csiVar = new csi(fouVar);
        this.bob = csiVar;
        String strBob = csiVar.bob();
        if (!TextUtils.isEmpty(strBob) && !strBob.startsWith("pag")) {
            strBob = "pag_".concat(strBob);
        }
        this.oq = new oq(this.bob.oq(), strBob);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq() {
        fou fouVar = this.bob;
        if (fouVar == null || fouVar.csi() == null || this.bob.rhi() == null) {
            return;
        }
        this.bob.kq().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uml.bob.1
            @Override // java.lang.Runnable
            public void run() {
                OutputStream outputStream;
                bob.this.csi++;
                try {
                    if (bob.this.fou != null) {
                        bob.this.fou.kq();
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(bob.this.bob.csi()).openConnection()));
                    if (bob.this.bob.rjo() != null && bob.this.bob.rjo().size() > 0) {
                        for (Map.Entry<String, String> entry : bob.this.bob.rjo().entrySet()) {
                            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty(CommonGatewayClient.HEADER_CONTENT_TYPE, "application/json");
                    try {
                        outputStream = httpURLConnection.getOutputStream();
                        try {
                            outputStream.write(bob.this.bob.rhi().toString().getBytes());
                            outputStream.close();
                            int responseCode = httpURLConnection.getResponseCode();
                            Log.i("StrategyCenter", "executing strategy fetch");
                            if (responseCode == 200) {
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                                StringBuffer stringBuffer = new StringBuffer();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        stringBuffer.append(line);
                                    }
                                }
                                bufferedReader.close();
                                JSONObject jSONObjectKq = bob.this.bob.kq(new JSONObject(stringBuffer.toString()));
                                bob.this.oq.kq();
                                bob.this.oq.kq(jSONObjectKq);
                                if (bob.this.fou != null) {
                                    bob.this.fou.oq();
                                }
                            } else if (bob.this.fou != null) {
                                bob.this.fou.kq(responseCode, httpURLConnection.getResponseMessage());
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        outputStream = null;
                    }
                } catch (Throwable th3) {
                    Log.e("StrategyCenter", th3.getMessage() == null ? "error " : th3.getMessage());
                    if (bob.this.fou != null) {
                        bob.this.fou.kq(-1, th3.getMessage());
                    }
                }
                bob.this.oq.kq("local_last_update_time", System.currentTimeMillis());
                bob.this.kq();
            }
        });
    }

    public void kq(kq kqVar) {
        this.fou = kqVar;
    }

    public void kq() {
        if (this.bob != null) {
            int i10 = 3600000;
            int iKq = this.oq.kq("req_interval", 3600000);
            long j10 = 0;
            long jOq = this.oq.oq("local_last_update_time", 0L);
            if (iKq >= 600000 && iKq <= 86400000) {
                i10 = iKq;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - jOq;
            Log.i("StrategyCenter", "before  realInterval=".concat(String.valueOf(jCurrentTimeMillis)));
            if (jCurrentTimeMillis >= 0) {
                long j11 = i10;
                if (jCurrentTimeMillis <= j11) {
                    j10 = j11 - jCurrentTimeMillis;
                }
            }
            Log.i("StrategyCenter", "after  realInterval=".concat(String.valueOf(j10)));
            this.bob.fou().removeCallbacks(this.rhi);
            if (this.csi > 24) {
                return;
            }
            this.bob.fou().postDelayed(this.rhi, j10);
        }
    }

    public int kq(String str, int i10) {
        oq oqVar = this.oq;
        return oqVar == null ? i10 : oqVar.kq(str, i10);
    }

    public String kq(String str, String str2) {
        oq oqVar = this.oq;
        return oqVar == null ? str2 : oqVar.kq(str, str2);
    }

    public boolean kq(String str, boolean z9) {
        oq oqVar = this.oq;
        return oqVar == null ? z9 : oqVar.kq(str, z9);
    }
}
