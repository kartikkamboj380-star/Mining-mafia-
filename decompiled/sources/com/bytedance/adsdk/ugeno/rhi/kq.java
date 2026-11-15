package com.bytedance.adsdk.ugeno.rhi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq<T> extends FrameLayout implements com.bytedance.adsdk.ugeno.syt.bob.fou {
    private static final Interpolator ibd = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.rhi.kq.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    protected Context bob;
    private int csi;
    private int dgq;
    private Scroller ebt;
    private int fax;
    private int fou;
    private int gm;
    private final Runnable ha;
    private FrameLayout jhe;
    protected List<T> kq;
    private int mq;
    private boolean mxq;
    private C0231kq nb;
    private String nn;
    private boolean nze;
    protected com.bytedance.adsdk.ugeno.syt.bob oq;
    private com.bytedance.adsdk.ugeno.rhi.bob ou;
    private int rhi;
    private int rjo;
    private final Runnable rs;
    private boolean sns;
    private boolean suf;
    private int syt;
    private float ubx;
    private com.bytedance.adsdk.ugeno.rhi.kq.kq uml;
    private boolean vvw;
    private int wcx;
    private boolean wki;

    public class bob extends com.bytedance.adsdk.ugeno.syt.bob {
        public bob(Context context) {
            super(context);
        }

        private MotionEvent kq(MotionEvent motionEvent) {
            float width = getWidth();
            float height = getHeight();
            motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
            return motionEvent;
        }

        @Override // com.bytedance.adsdk.ugeno.syt.bob, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!kq.this.nze) {
                return false;
            }
            try {
                if (kq.this.mq != 1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(kq(motionEvent));
                kq(motionEvent);
                return zOnInterceptTouchEvent;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.syt.bob, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!kq.this.nze) {
                return false;
            }
            try {
                return kq.this.mq == 1 ? super.onTouchEvent(kq(motionEvent)) : super.onTouchEvent(motionEvent);
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.rhi.kq$kq, reason: collision with other inner class name */
    class C0231kq extends com.bytedance.adsdk.ugeno.syt.oq {
        C0231kq() {
        }

        @Override // com.bytedance.adsdk.ugeno.syt.oq
        public int kq(Object obj) {
            return -2;
        }

        @Override // com.bytedance.adsdk.ugeno.syt.oq
        public boolean kq(View view, Object obj) {
            return view == obj;
        }

        @Override // com.bytedance.adsdk.ugeno.syt.oq
        public int kq() {
            return kq.this.suf ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET : kq.this.kq.size();
        }

        @Override // com.bytedance.adsdk.ugeno.syt.oq
        public Object kq(ViewGroup viewGroup, int i10) {
            View viewKq = kq.this.kq(i10, fou.kq(kq.this.suf, i10, kq.this.kq.size()));
            viewGroup.addView(viewKq);
            return viewKq;
        }

        @Override // com.bytedance.adsdk.ugeno.syt.oq
        public void kq(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // com.bytedance.adsdk.ugeno.syt.oq
        public float kq(int i10) {
            if (kq.this.ubx <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return 1.0f;
            }
            return 1.0f / kq.this.ubx;
        }
    }

    private class oq extends Scroller {
        public oq(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            super.startScroll(i10, i11, i12, i13, kq.this.rhi);
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13) {
            super.startScroll(i10, i11, i12, i13, kq.this.rhi);
        }
    }

    public kq(Context context) {
        super(context);
        this.kq = new CopyOnWriteArrayList();
        this.fou = 2000;
        this.csi = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        this.rhi = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        this.rjo = 0;
        this.syt = -1;
        this.dgq = -1;
        this.nn = "normal";
        this.ubx = 1.0f;
        this.vvw = true;
        this.wki = true;
        this.suf = true;
        this.nze = true;
        this.wcx = 0;
        this.gm = 0;
        this.fax = 0;
        this.mq = 0;
        this.rs = new Runnable() { // from class: com.bytedance.adsdk.ugeno.rhi.kq.2
            @Override // java.lang.Runnable
            public void run() {
                int currentItem = kq.this.oq.getCurrentItem() + 1;
                if (kq.this.suf) {
                    if (currentItem >= 1024) {
                        kq.this.oq.kq(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, false);
                        return;
                    } else {
                        kq.this.oq.kq(currentItem, true);
                        return;
                    }
                }
                com.bytedance.adsdk.ugeno.syt.oq adapter = kq.this.oq.getAdapter();
                if (adapter != null) {
                    if (currentItem >= adapter.kq()) {
                        kq.this.oq.kq(0, false);
                    } else {
                        kq.this.oq.kq(currentItem, true);
                    }
                }
            }
        };
        this.ha = new Runnable() { // from class: com.bytedance.adsdk.ugeno.rhi.kq.3
            @Override // java.lang.Runnable
            public void run() {
                if (kq.this.wki) {
                    int currentItem = kq.this.oq.getCurrentItem() + 1;
                    if (kq.this.suf) {
                        if (currentItem >= 1024) {
                            kq.this.oq.kq(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, false);
                        } else {
                            kq.this.oq.kq(currentItem, true);
                        }
                        kq kqVar = kq.this;
                        kqVar.postDelayed(kqVar.ha, kq.this.fou);
                        return;
                    }
                    com.bytedance.adsdk.ugeno.syt.oq adapter = kq.this.oq.getAdapter();
                    if (adapter != null) {
                        if (currentItem >= adapter.kq()) {
                            kq.this.oq.kq(0, false);
                            kq kqVar2 = kq.this;
                            kqVar2.postDelayed(kqVar2.ha, kq.this.fou);
                        } else {
                            kq.this.oq.kq(currentItem, true);
                            kq kqVar3 = kq.this;
                            kqVar3.postDelayed(kqVar3.ha, kq.this.fou);
                        }
                    }
                }
            }
        };
        this.bob = context;
        this.jhe = new FrameLayout(context);
        this.oq = kq();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.jhe.addView(this.oq, layoutParams);
        addView(this.jhe);
    }

    public kq dgq(int i10) {
        this.dgq = i10;
        kq(this.nn, this.rjo, this.syt, i10, true);
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.wki) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                if (!this.mxq) {
                    csi();
                }
            } else if (action == 0) {
                rhi();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public com.bytedance.adsdk.ugeno.syt.oq getAdapter() {
        return this.oq.getAdapter();
    }

    public int getCurrentItem() {
        return this.oq.getCurrentItem();
    }

    public com.bytedance.adsdk.ugeno.syt.bob getViewPager() {
        return this.oq;
    }

    public abstract View nn(int i10);

    public void setOnPageChangeListener(com.bytedance.adsdk.ugeno.rhi.bob bobVar) {
        this.ou = bobVar;
    }

    public void setTwoItems(boolean z9) {
        this.sns = z9;
    }

    @Override // com.bytedance.adsdk.ugeno.syt.bob.fou
    public void ubx(int i10) {
        int i11;
        if (this.ou != null) {
            int iKq = fou.kq(this.suf, i10, this.kq.size());
            i11 = i10;
            this.ou.kq(this.suf, iKq, i11, iKq == 0, iKq == this.kq.size() - 1);
        } else {
            i11 = i10;
        }
        if (this.vvw) {
            this.uml.kq(i11);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.syt.bob.fou
    public void vvw(int i10) {
        if (i10 == 1 && this.mxq) {
            rhi();
        }
        com.bytedance.adsdk.ugeno.rhi.bob bobVar = this.ou;
        if (bobVar != null) {
            bobVar.kq(this.suf, i10);
        }
    }

    public void wki(int i10) {
        kq(this.nn, this.rjo, this.syt, this.dgq, true);
        if (this.nb == null) {
            this.nb = new C0231kq();
            this.oq.kq((com.bytedance.adsdk.ugeno.syt.bob.fou) this);
            this.oq.setAdapter(this.nb);
        }
        if (this.suf) {
            if (i10 >= 1024) {
                this.oq.kq(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, false);
                return;
            } else {
                this.oq.kq(i10, true);
                return;
            }
        }
        if (i10 < 0 || i10 >= this.kq.size()) {
            return;
        }
        this.oq.kq(i10, true);
    }

    public kq bob(float f10) {
        this.uml.setIndicatorX(f10);
        return this;
    }

    public kq csi(int i10) {
        this.uml.setSelectedColor(i10);
        return this;
    }

    public kq fou(float f10) {
        this.uml.setIndicatorY(f10);
        return this;
    }

    public com.bytedance.adsdk.ugeno.syt.bob kq() {
        return new bob(getContext());
    }

    public kq oq(float f10) {
        this.uml.setIndicatorHeight((int) f10);
        return this;
    }

    public kq rhi(int i10) {
        this.uml.setUnSelectedColor(i10);
        return this;
    }

    public kq rjo(int i10) {
        this.rjo = i10;
        kq(this.nn, i10, this.syt, this.dgq, true);
        return this;
    }

    public kq<T> syt(int i10) {
        this.syt = i10;
        kq(this.nn, this.rjo, i10, this.dgq, true);
        return this;
    }

    public kq bob(int i10) {
        this.rhi = i10;
        if (this.ebt == null) {
            this.ebt = new oq(this.bob, ibd);
        }
        this.oq.setScroller(this.ebt);
        return this;
    }

    public kq csi(float f10) {
        this.ubx = f10;
        return this;
    }

    public kq fou(int i10) {
        this.fou = i10;
        csi();
        return this;
    }

    public kq kq(String str) {
        if (TextUtils.equals(str, "rectangle")) {
            this.uml = new com.bytedance.adsdk.ugeno.rhi.kq.bob(this.bob);
        } else {
            this.uml = new com.bytedance.adsdk.ugeno.rhi.kq.oq(this.bob);
        }
        addView(this.uml, new FrameLayout.LayoutParams(-2, -2));
        return this;
    }

    public kq oq() {
        this.uml.kq();
        return this;
    }

    public void rhi() {
        removeCallbacks(this.ha);
    }

    private boolean rjo() {
        return this.kq.size() <= 2 && this.suf;
    }

    public kq csi(boolean z9) {
        this.mxq = z9;
        return this;
    }

    public kq oq(String str) {
        this.uml.setIndicatorDirection(str);
        return this;
    }

    public void csi() {
        removeCallbacks(this.ha);
        postDelayed(this.ha, this.fou);
    }

    public kq fou(boolean z9) {
        this.uml.setLoop(z9);
        if (this.suf != z9) {
            int iKq = fou.kq(z9, this.oq.getCurrentItem(), this.kq.size());
            this.suf = z9;
            C0231kq c0231kq = this.nb;
            if (c0231kq != null) {
                c0231kq.bob();
                this.oq.setCurrentItem(iKq);
            }
        }
        return this;
    }

    public kq oq(int i10) {
        this.csi = i10;
        return this;
    }

    public kq oq(boolean z9) {
        this.nze = z9;
        return this;
    }

    public kq bob(boolean z9) {
        this.vvw = z9;
        return this;
    }

    public kq kq(float f10) {
        this.uml.setIndicatorWidth((int) f10);
        return this;
    }

    public kq bob(String str) {
        this.nn = str;
        kq(str, this.rjo, this.syt, this.dgq, true);
        return this;
    }

    public kq kq(int i10) {
        this.mq = i10;
        return this;
    }

    public kq kq(boolean z9) {
        this.wki = z9;
        csi();
        return this;
    }

    public void bob() {
        int i10;
        kq(this.nn, this.rjo, this.syt, this.dgq, true);
        if (this.nb == null) {
            this.nb = new C0231kq();
            this.oq.kq((com.bytedance.adsdk.ugeno.syt.bob.fou) this);
            this.oq.setAdapter(this.nb);
        }
        int i11 = this.wcx;
        if (i11 < 0 || i11 >= this.kq.size()) {
            this.wcx = 0;
        }
        if (this.suf) {
            i10 = this.wcx + IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        } else {
            i10 = this.wcx;
        }
        this.oq.kq(i10, true);
        if (!this.suf) {
            ubx(i10);
        }
        if (this.wki) {
            csi();
        }
    }

    public void kq(String str, int i10, int i11, int i12, boolean z9) {
        C0231kq c0231kq = this.nb;
        if (c0231kq != null) {
            c0231kq.bob();
        }
        this.oq.setPageMargin(i10);
        if (i11 > 0 || i12 > 0) {
            if (this.mq == 1) {
                this.oq.setPadding(0, i11 + i10, 0, i12 + i10);
            } else {
                this.oq.setPadding(i11 + i10, 0, i12 + i10, 0);
            }
            this.jhe.setClipChildren(false);
            this.oq.setClipChildren(false);
            this.oq.setClipToPadding(false);
        }
        if (this.mq == 1) {
            com.bytedance.adsdk.ugeno.rhi.oq.fou fouVar = new com.bytedance.adsdk.ugeno.rhi.oq.fou();
            fouVar.kq(str);
            this.oq.kq(true, (com.bytedance.adsdk.ugeno.syt.bob.csi) fouVar);
            this.oq.setOverScrollMode(2);
        } else if (TextUtils.equals(str, "linear")) {
            this.oq.kq(false, (com.bytedance.adsdk.ugeno.syt.bob.csi) new com.bytedance.adsdk.ugeno.rhi.oq.bob());
        } else if (TextUtils.equals(str, "cube")) {
            this.oq.kq(false, (com.bytedance.adsdk.ugeno.syt.bob.csi) new com.bytedance.adsdk.ugeno.rhi.oq.kq());
        } else if (TextUtils.equals(str, "fade")) {
            this.oq.kq(false, (com.bytedance.adsdk.ugeno.syt.bob.csi) new com.bytedance.adsdk.ugeno.rhi.oq.oq());
        } else {
            this.oq.kq(false, (com.bytedance.adsdk.ugeno.syt.bob.csi) null);
        }
        this.oq.setOffscreenPageLimit((int) this.ubx);
    }

    public void fou() {
        rhi();
        if (this.nb != null) {
            this.oq.oq((com.bytedance.adsdk.ugeno.syt.bob.fou) this);
            this.oq.setAdapter(null);
            this.nb = null;
            this.oq.removeAllViews();
            this.kq.clear();
            this.uml.bob();
        }
    }

    public View kq(int i10, int i11) {
        if (this.kq.size() == 0) {
            return new View(getContext());
        }
        View viewNn = nn(i11);
        FrameLayout frameLayout = new FrameLayout(getContext());
        if (viewNn instanceof ViewGroup) {
            frameLayout.setClipChildren(true);
        }
        if (rjo()) {
            viewNn.setTag("two_items_tag");
        }
        if (viewNn.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewNn.getParent()).removeView(viewNn);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        frameLayout.addView(viewNn, layoutParams);
        frameLayout.addView(new View(getContext()), new FrameLayout.LayoutParams(-1, -1));
        if (rjo()) {
            frameLayout.setTag(Integer.valueOf(i10));
        }
        return frameLayout;
    }

    public kq<T> kq(T t10) {
        if (t10 != null) {
            this.kq.add(t10);
            if (this.vvw) {
                this.uml.oq();
            }
        }
        C0231kq c0231kq = this.nb;
        if (c0231kq != null) {
            c0231kq.bob();
            this.uml.kq(this.wcx, this.oq.getCurrentItem());
        }
        return this;
    }

    @Override // com.bytedance.adsdk.ugeno.syt.bob.fou
    public void kq(int i10, float f10, int i11) {
        com.bytedance.adsdk.ugeno.rhi.bob bobVar = this.ou;
        if (bobVar != null) {
            boolean z9 = this.suf;
            bobVar.kq(z9, fou.kq(z9, i10, this.kq.size()), f10, i11);
        }
        if (rjo()) {
            kq(i10, findViewWithTag(Integer.valueOf(i10)));
            if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i12 = i10 + 1;
                kq(i12, findViewWithTag(Integer.valueOf(i12)));
            }
        }
    }

    private void kq(int i10, View view) {
        View viewFindViewWithTag;
        if ((view instanceof ViewGroup) && (viewFindViewWithTag = view.findViewWithTag("two_items_tag")) == null) {
            T t10 = this.kq.get(fou.kq(true, i10, this.kq.size()));
            if (t10 == null) {
                return;
            }
            if (t10 instanceof com.bytedance.adsdk.ugeno.oq.bob) {
                viewFindViewWithTag = ((com.bytedance.adsdk.ugeno.oq.bob) t10).ubx();
            } else if (t10 instanceof View) {
                viewFindViewWithTag = (View) t10;
            }
            if (viewFindViewWithTag == null) {
                return;
            }
            if (viewFindViewWithTag.getParent() instanceof ViewGroup) {
                ((ViewGroup) viewFindViewWithTag.getParent()).removeView(viewFindViewWithTag);
            }
            ((ViewGroup) view).addView(viewFindViewWithTag);
        }
    }
}
