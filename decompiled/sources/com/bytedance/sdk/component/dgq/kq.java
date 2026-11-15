package com.bytedance.sdk.component.dgq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.dgq;
import com.bytedance.sdk.component.utils.fgm;
import com.bytedance.sdk.component.utils.rs;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class kq extends bob implements rs.kq {
    private final int bob;
    private final int csi;
    private View.OnTouchListener fax;
    private final List<Integer> fou;
    private String gm;
    private boolean mxq;
    private final int oq;
    private final Context rhi;
    private volatile float rjo;
    private float sns;
    private volatile float syt;
    private long ubx;
    private long vvw;
    private float wcx;
    private int wki;
    private float dgq = -1.0f;
    private float nn = -1.0f;
    private final Handler nze = new rs(dgq.kq().getLooper(), this);
    InterfaceC0247kq kq = new InterfaceC0247kq() { // from class: com.bytedance.sdk.component.dgq.kq.1
        @Override // com.bytedance.sdk.component.dgq.kq.InterfaceC0247kq
        public void kq() {
            if (kq.this.dgq == -1.0f && kq.this.nn == -1.0f && kq.this.vvw == -1) {
                float unused = kq.this.dgq;
                float unused2 = kq.this.nn;
                kq kqVar = kq.this;
                kqVar.dgq = kqVar.rjo;
                kq kqVar2 = kq.this;
                kqVar2.nn = kqVar2.syt;
                kq kqVar3 = kq.this;
                kqVar3.vvw = kqVar3.ubx;
                kq.this.mxq = true;
            }
            float unused3 = kq.this.dgq;
            float unused4 = kq.this.nn;
        }

        @Override // com.bytedance.sdk.component.dgq.kq.InterfaceC0247kq
        public void kq(int i10) {
            kq.this.wki = i10;
            kq.this.oq();
        }
    };
    private int mq = -1;
    private final List<Integer> suf = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.dgq.kq$kq, reason: collision with other inner class name */
    public interface InterfaceC0247kq {
        void kq();

        void kq(int i10);
    }

    public kq(Context context, int i10, int i11, List<Integer> list, int i12) {
        this.rhi = context;
        if (i10 == -1) {
            this.oq = fgm.kq(context);
        } else {
            this.oq = fgm.kq(context, i10);
        }
        this.bob = fgm.kq(context, i11);
        this.fou = list;
        this.csi = i12;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        kq kqVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        this.ubx = SystemClock.elapsedRealtime();
        this.rjo = x10;
        this.syt = y9;
        if (action == 0) {
            kqVar = this;
            kqVar.sns = x10;
            kqVar.wcx = y9;
        } else if (action != 1) {
            kqVar = this;
        } else {
            kqVar = this;
            if (kqVar.kq(x10, y9, this.sns, this.wcx, this.rhi)) {
                int iKq = kq(kqVar.rjo, kqVar.syt, kqVar.ubx);
                boolean zContains = kqVar.suf.contains(Integer.valueOf(kqVar.wki));
                kq(view, motionEvent, iKq, !zContains);
                if (!zContains) {
                    kqVar.suf.add(Integer.valueOf(kqVar.wki));
                }
                if (iKq == 0) {
                    motionEvent.setAction(3);
                }
            }
        }
        View.OnTouchListener onTouchListener = kqVar.fax;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oq() {
        this.dgq = -1.0f;
        this.nn = -1.0f;
        this.vvw = -1L;
    }

    @Override // com.bytedance.sdk.component.dgq.bob
    public void kq(View.OnTouchListener onTouchListener) {
        this.fax = onTouchListener;
    }

    public InterfaceC0247kq kq() {
        return this.kq;
    }

    private void kq(View view, MotionEvent motionEvent, int i10, boolean z9) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        jSONObject.put("is_interceptor", i10 == 0 ? 1 : 0);
        jSONObject.put("is_first_click", z9 ? 1 : 0);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i10);
        jSONObject.put("current_url_index", this.wki);
        Message messageObtain = Message.obtain();
        messageObtain.what = 100;
        messageObtain.obj = jSONObject;
        this.nze.sendMessageDelayed(messageObtain, 200L);
    }

    public void kq(String str) {
        this.gm = str;
    }

    private int kq(float f10, float f11, long j10) {
        if (this.dgq == -1.0f && this.nn == -1.0f && this.vvw == -1) {
            return 1;
        }
        if (!this.fou.contains(Integer.valueOf(this.wki))) {
            return 2;
        }
        if (j10 - this.vvw > this.csi) {
            oq();
            return 3;
        }
        float fAbs = Math.abs(f10 - this.dgq);
        float fAbs2 = Math.abs(f11 - this.nn);
        if (fAbs <= this.oq / 2.0f && fAbs2 <= this.bob / 2.0f) {
            return 0;
        }
        oq();
        return 4;
    }

    @Override // com.bytedance.sdk.component.utils.rs.kq
    public void kq(Message message) {
        int i10 = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i10 == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.mxq ? 1 : 0);
                    this.mxq = false;
                } catch (Throwable unused) {
                }
            }
            if (com.bytedance.sdk.component.dgq.kq.kq.kq().oq() != null) {
                com.bytedance.sdk.component.dgq.kq.kq.kq().oq().kq(this.gm, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
