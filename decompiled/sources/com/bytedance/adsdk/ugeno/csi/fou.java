package com.bytedance.adsdk.ugeno.csi;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class fou {
    static final /* synthetic */ boolean bob = true;
    private boolean[] csi;
    private final com.bytedance.adsdk.ugeno.csi.kq fou;
    int[] kq;
    long[] oq;
    private long[] rhi;

    static class kq {
        List<bob> kq;
        int oq;

        kq() {
        }

        void kq() {
            this.kq = null;
            this.oq = 0;
        }
    }

    private static class oq implements Comparable<oq> {
        int kq;
        int oq;

        private oq() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: kq, reason: merged with bridge method [inline-methods] */
        public int compareTo(oq oqVar) {
            int i10 = this.oq;
            int i11 = oqVar.oq;
            return i10 != i11 ? i10 - i11 : this.kq - oqVar.kq;
        }

        public String toString() {
            return "Order{order=" + this.oq + ", index=" + this.kq + '}';
        }
    }

    fou(com.bytedance.adsdk.ugeno.csi.kq kqVar) {
        this.fou = kqVar;
    }

    private int bob(boolean z9) {
        return z9 ? this.fou.getPaddingTop() : this.fou.getPaddingStart();
    }

    private int csi(com.bytedance.adsdk.ugeno.csi.oq oqVar, boolean z9) {
        return z9 ? oqVar.suf() : oqVar.wki();
    }

    private int fou(boolean z9) {
        return z9 ? this.fou.getPaddingBottom() : this.fou.getPaddingEnd();
    }

    private int rhi(com.bytedance.adsdk.ugeno.csi.oq oqVar, boolean z9) {
        return z9 ? oqVar.mxq() : oqVar.nze();
    }

    int kq(long j10) {
        return (int) j10;
    }

    int oq(long j10) {
        return (int) (j10 >> 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    int[] kq(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.fou.getFlexItemCount();
        List<oq> listOq = oq(flexItemCount);
        oq oqVar = new oq();
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.csi.oq)) {
            oqVar.oq = 1;
        } else {
            oqVar.oq = ((com.bytedance.adsdk.ugeno.csi.oq) layoutParams).bob();
        }
        if (i10 == -1 || i10 == flexItemCount || i10 >= this.fou.getFlexItemCount()) {
            oqVar.kq = flexItemCount;
        } else {
            oqVar.kq = i10;
            while (i10 < flexItemCount) {
                listOq.get(i10).kq++;
                i10++;
            }
        }
        listOq.add(oqVar);
        return kq(flexItemCount + 1, listOq, sparseIntArray);
    }

    long oq(int i10, int i11) {
        return (((long) i10) & 4294967295L) | (((long) i11) << 32);
    }

    private int bob(com.bytedance.adsdk.ugeno.csi.oq oqVar, boolean z9) {
        if (z9) {
            return oqVar.wki();
        }
        return oqVar.suf();
    }

    private int fou(com.bytedance.adsdk.ugeno.csi.oq oqVar, boolean z9) {
        if (z9) {
            return oqVar.nze();
        }
        return oqVar.mxq();
    }

    private List<oq> oq(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            com.bytedance.adsdk.ugeno.csi.oq oqVar = (com.bytedance.adsdk.ugeno.csi.oq) this.fou.kq(i11).getLayoutParams();
            oq oqVar2 = new oq();
            oqVar2.oq = oqVar.bob();
            oqVar2.kq = i11;
            arrayList.add(oqVar2);
        }
        return arrayList;
    }

    private void bob(int i10) {
        boolean[] zArr = this.csi;
        if (zArr == null) {
            this.csi = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.csi = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    boolean oq(SparseIntArray sparseIntArray) {
        int flexItemCount = this.fou.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View viewKq = this.fou.kq(i10);
            if (viewKq != null && ((com.bytedance.adsdk.ugeno.csi.oq) viewKq.getLayoutParams()).bob() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    void oq(kq kqVar, int i10, int i11) {
        kq(kqVar, i11, i10, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, -1, (List<bob>) null);
    }

    private int oq(boolean z9) {
        if (z9) {
            return this.fou.getPaddingEnd();
        }
        return this.fou.getPaddingBottom();
    }

    int[] kq(SparseIntArray sparseIntArray) {
        int flexItemCount = this.fou.getFlexItemCount();
        return kq(flexItemCount, oq(flexItemCount), sparseIntArray);
    }

    private int oq(View view, boolean z9) {
        if (z9) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private int[] kq(int i10, List<oq> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (oq oqVar : list) {
            int i12 = oqVar.kq;
            iArr[i11] = i12;
            sparseIntArray.append(i12, oqVar.oq);
            i11++;
        }
        return iArr;
    }

    private int oq(com.bytedance.adsdk.ugeno.csi.oq oqVar, boolean z9) {
        if (z9) {
            return oqVar.oq();
        }
        return oqVar.kq();
    }

    private void oq(int i10, int i11, bob bobVar, int i12, int i13, boolean z9) {
        float f10;
        float f11;
        int iMax;
        int iRjo;
        int i14 = bobVar.csi;
        float f12 = bobVar.ubx;
        float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f12 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i12 > i14) {
            return;
        }
        float f14 = (i14 - i12) / f12;
        bobVar.csi = i13 + bobVar.rhi;
        if (!z9) {
            bobVar.rjo = LinearLayoutManager.INVALID_OFFSET;
        }
        int i15 = 0;
        boolean z10 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < bobVar.syt) {
            int i17 = bobVar.nze + i15;
            View viewOq = this.fou.oq(i17);
            if (viewOq == null || viewOq.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
            } else {
                com.bytedance.adsdk.ugeno.csi.oq oqVar = (com.bytedance.adsdk.ugeno.csi.oq) viewOq.getLayoutParams();
                int flexDirection = this.fou.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewOq.getMeasuredHeight();
                    long[] jArr = this.rhi;
                    if (jArr != null) {
                        measuredHeight = oq(jArr[i17]);
                    }
                    int measuredWidth = viewOq.getMeasuredWidth();
                    long[] jArr2 = this.rhi;
                    if (jArr2 != null) {
                        measuredWidth = kq(jArr2[i17]);
                    }
                    if (!this.csi[i17] && oqVar.csi() > f10) {
                        float fCsi = measuredHeight - (oqVar.csi() * f14);
                        if (i15 == bobVar.syt - 1) {
                            fCsi += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fCsi);
                        if (iRound < oqVar.syt()) {
                            iRound = oqVar.syt();
                            this.csi[i17] = true;
                            bobVar.ubx -= oqVar.csi();
                            z10 = true;
                        } else {
                            f15 += fCsi - iRound;
                            double d10 = f15;
                            if (d10 > 1.0d) {
                                iRound++;
                                f15 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                iRound--;
                                f15 += 1.0f;
                            }
                        }
                        int iKq = kq(i10, oqVar, bobVar.wki);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewOq.measure(iKq, iMakeMeasureSpec);
                        int measuredWidth2 = viewOq.getMeasuredWidth();
                        int measuredHeight2 = viewOq.getMeasuredHeight();
                        kq(i17, iKq, iMakeMeasureSpec, viewOq);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, measuredWidth + oqVar.wki() + oqVar.nze() + this.fou.kq(viewOq));
                    bobVar.csi += measuredHeight + oqVar.suf() + oqVar.mxq();
                    f11 = f14;
                } else {
                    int measuredWidth3 = viewOq.getMeasuredWidth();
                    long[] jArr3 = this.rhi;
                    if (jArr3 != null) {
                        measuredWidth3 = kq(jArr3[i17]);
                    }
                    int measuredHeight3 = viewOq.getMeasuredHeight();
                    long[] jArr4 = this.rhi;
                    f11 = f14;
                    if (jArr4 != null) {
                        measuredHeight3 = oq(jArr4[i17]);
                    }
                    if (!this.csi[i17] && oqVar.csi() > f10) {
                        float fCsi2 = measuredWidth3 - (f11 * oqVar.csi());
                        if (i15 == bobVar.syt - 1) {
                            fCsi2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fCsi2);
                        if (iRound2 < oqVar.rjo()) {
                            iRjo = oqVar.rjo();
                            this.csi[i17] = true;
                            bobVar.ubx -= oqVar.csi();
                            z10 = true;
                        } else {
                            f15 += fCsi2 - iRound2;
                            double d11 = f15;
                            if (d11 > 1.0d) {
                                iRjo = iRound2 + 1;
                                f15 -= 1.0f;
                            } else if (d11 < -1.0d) {
                                iRjo = iRound2 - 1;
                                f15 += 1.0f;
                            } else {
                                iRjo = iRound2;
                            }
                        }
                        int iOq = oq(i11, oqVar, bobVar.wki);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRjo, 1073741824);
                        viewOq.measure(iMakeMeasureSpec2, iOq);
                        int measuredWidth4 = viewOq.getMeasuredWidth();
                        int measuredHeight4 = viewOq.getMeasuredHeight();
                        kq(i17, iMakeMeasureSpec2, iOq, viewOq);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, measuredHeight3 + oqVar.suf() + oqVar.mxq() + this.fou.kq(viewOq));
                    bobVar.csi += measuredWidth3 + oqVar.wki() + oqVar.nze();
                    iMax = iMax2;
                }
                bobVar.rjo = Math.max(bobVar.rjo, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z10 || i14 == bobVar.csi) {
            return;
        }
        oq(i10, i11, bobVar, i12, i13, true);
    }

    void kq(kq kqVar, int i10, int i11) {
        kq(kqVar, i10, i11, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, -1, (List<bob>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void kq(kq kqVar, int i10, int i11, int i12, int i13, int i14, List<bob> list) {
        int i15;
        int i16;
        int i17;
        int i18;
        int iKq;
        int i19;
        int i20;
        int i21;
        bob bobVar;
        int i22;
        int i23;
        boolean z9;
        int i24;
        boolean z10;
        int i25;
        int i26 = i10;
        boolean zKq = this.fou.kq();
        int mode = View.MeasureSpec.getMode(i26);
        int size = View.MeasureSpec.getSize(i26);
        List<bob> arrayList = list == null ? new ArrayList() : list;
        kqVar.kq = arrayList;
        boolean z11 = i14 == -1;
        int iKq2 = kq(zKq);
        int iOq = oq(zKq);
        int iBob = bob(zKq);
        int iFou = fou(zKq);
        bob bobVar2 = new bob();
        int i27 = i13;
        bobVar2.nze = i27;
        int i28 = iKq2 + iOq;
        bobVar2.csi = i28;
        int flexItemCount = this.fou.getFlexItemCount();
        boolean z12 = z11;
        bob bobVar3 = bobVar2;
        int i29 = Integer.MIN_VALUE;
        int i30 = 0;
        int iCombineMeasuredStates = 0;
        int i31 = 0;
        while (i27 < flexItemCount) {
            View viewOq = this.fou.oq(i27);
            if (viewOq == null) {
                if (kq(i27, flexItemCount, bobVar3)) {
                    kq(arrayList, bobVar3, i27, i30);
                }
                i16 = i28;
            } else {
                i16 = i28;
                if (viewOq.getVisibility() == 8) {
                    bobVar3.dgq++;
                    bobVar3.syt++;
                    if (kq(i27, flexItemCount, bobVar3)) {
                        kq(arrayList, bobVar3, i27, i30);
                    }
                } else {
                    if (viewOq instanceof CompoundButton) {
                        kq((CompoundButton) viewOq);
                    }
                    com.bytedance.adsdk.ugeno.csi.oq oqVar = (com.bytedance.adsdk.ugeno.csi.oq) viewOq.getLayoutParams();
                    int i32 = flexItemCount;
                    if (oqVar.rhi() == 4) {
                        bobVar3.suf.add(Integer.valueOf(i27));
                    }
                    int iKq3 = kq(oqVar, zKq);
                    if (oqVar.vvw() != -1.0f && mode == 1073741824) {
                        iKq3 = Math.round(size * oqVar.vvw());
                    }
                    if (zKq) {
                        iKq = this.fou.kq(i26, i16 + bob(oqVar, true) + fou(oqVar, true), iKq3);
                        i17 = i30;
                        int iOq2 = this.fou.oq(i11, iBob + iFou + csi(oqVar, true) + rhi(oqVar, true) + i30, oq(oqVar, true));
                        viewOq.measure(iKq, iOq2);
                        kq(i27, iKq, iOq2, viewOq);
                        i18 = 0;
                    } else {
                        i17 = i30;
                        i18 = 0;
                        int iKq4 = this.fou.kq(i11, iBob + iFou + csi(oqVar, false) + rhi(oqVar, false) + i17, oq(oqVar, false));
                        int iOq3 = this.fou.oq(i26, i16 + bob(oqVar, false) + fou(oqVar, false), iKq3);
                        viewOq.measure(iKq4, iOq3);
                        kq(i27, iKq4, iOq3, viewOq);
                        iKq = iOq3;
                    }
                    kq(viewOq, i27);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewOq.getMeasuredState());
                    int i33 = i18;
                    i19 = i27;
                    int i34 = iKq;
                    bob bobVar4 = bobVar3;
                    int i35 = i31;
                    i20 = i16;
                    i21 = i17;
                    boolean z13 = zKq;
                    size = size;
                    if (kq(viewOq, mode, size, bobVar3.csi, kq(viewOq, zKq) + bob(oqVar, zKq) + fou(oqVar, zKq), oqVar, i19, i35, arrayList.size())) {
                        if (bobVar4.oq() > 0) {
                            kq(arrayList, bobVar4, i19 > 0 ? i19 - 1 : i33, i21);
                            i25 = i21 + bobVar4.rjo;
                        } else {
                            i25 = i21;
                        }
                        if (z13) {
                            if (oqVar.oq() == -1) {
                                com.bytedance.adsdk.ugeno.csi.kq kqVar2 = this.fou;
                                viewOq.measure(i34, kqVar2.oq(i11, kqVar2.getPaddingTop() + this.fou.getPaddingBottom() + oqVar.suf() + oqVar.mxq() + i25, oqVar.oq()));
                                kq(viewOq, i19);
                            }
                        } else if (oqVar.kq() == -1) {
                            com.bytedance.adsdk.ugeno.csi.kq kqVar3 = this.fou;
                            viewOq.measure(kqVar3.kq(i11, kqVar3.getPaddingLeft() + this.fou.getPaddingRight() + oqVar.wki() + oqVar.nze() + i25, oqVar.kq()), i34);
                            kq(viewOq, i19);
                        }
                        bob bobVar5 = new bob();
                        bobVar5.syt = 1;
                        bobVar5.csi = i20;
                        bobVar5.nze = i19;
                        i21 = i25;
                        i22 = i33;
                        bobVar = bobVar5;
                        i23 = Integer.MIN_VALUE;
                    } else {
                        bobVar = bobVar4;
                        bobVar.syt++;
                        i22 = i35 + 1;
                        i23 = i29;
                    }
                    bobVar.sns = (bobVar.sns ? 1 : 0) | (oqVar.fou() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i33);
                    bobVar.wcx = (bobVar.wcx ? 1 : 0) | (oqVar.csi() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i33);
                    int[] iArr = this.kq;
                    if (iArr != null) {
                        iArr[i19] = arrayList.size();
                    }
                    z9 = z13;
                    bobVar.csi += kq(viewOq, z9) + bob(oqVar, z9) + fou(oqVar, z9);
                    bobVar.nn += oqVar.fou();
                    bobVar.ubx += oqVar.csi();
                    this.fou.kq(viewOq, i19, i22, bobVar);
                    int iMax = Math.max(i23, oq(viewOq, z9) + csi(oqVar, z9) + rhi(oqVar, z9) + this.fou.kq(viewOq));
                    bobVar.rjo = Math.max(bobVar.rjo, iMax);
                    if (z9) {
                        if (this.fou.getFlexWrap() != 2) {
                            bobVar.vvw = Math.max(bobVar.vvw, viewOq.getBaseline() + oqVar.suf());
                        } else {
                            bobVar.vvw = Math.max(bobVar.vvw, (viewOq.getMeasuredHeight() - viewOq.getBaseline()) + oqVar.mxq());
                        }
                    }
                    i24 = i32;
                    if (kq(i19, i24, bobVar)) {
                        kq(arrayList, bobVar, i19, i21);
                        i21 += bobVar.rjo;
                    }
                    if (i14 != -1 && arrayList.size() > 0) {
                        if (arrayList.get(arrayList.size() - 1).mxq >= i14 && i19 >= i14 && !z12) {
                            i21 = -bobVar.kq();
                            z10 = true;
                        }
                        if (i21 <= i12 && z10) {
                            i15 = iCombineMeasuredStates;
                            kqVar.oq = i15;
                        } else {
                            i29 = iMax;
                            z12 = z10;
                            i31 = i22;
                        }
                    }
                    z10 = z12;
                    if (i21 <= i12) {
                    }
                    i29 = iMax;
                    z12 = z10;
                    i31 = i22;
                }
                int i36 = i19 + 1;
                zKq = z9;
                bobVar3 = bobVar;
                i28 = i20;
                i30 = i21;
                i26 = i10;
                flexItemCount = i24;
                i27 = i36;
                mode = mode;
            }
            i19 = i27;
            mode = mode;
            i24 = flexItemCount;
            i21 = i30;
            z9 = zKq;
            i20 = i16;
            bobVar = bobVar3;
            int i37 = i19 + 1;
            zKq = z9;
            bobVar3 = bobVar;
            i28 = i20;
            i30 = i21;
            i26 = i10;
            flexItemCount = i24;
            i27 = i37;
            mode = mode;
        }
        i15 = iCombineMeasuredStates;
        kqVar.oq = i15;
    }

    private int oq(int i10, com.bytedance.adsdk.ugeno.csi.oq oqVar, int i11) {
        com.bytedance.adsdk.ugeno.csi.kq kqVar = this.fou;
        int iOq = kqVar.oq(i10, kqVar.getPaddingTop() + this.fou.getPaddingBottom() + oqVar.suf() + oqVar.mxq() + i11, oqVar.oq());
        int size = View.MeasureSpec.getSize(iOq);
        if (size > oqVar.nn()) {
            return View.MeasureSpec.makeMeasureSpec(oqVar.nn(), View.MeasureSpec.getMode(iOq));
        }
        return size < oqVar.syt() ? View.MeasureSpec.makeMeasureSpec(oqVar.syt(), View.MeasureSpec.getMode(iOq)) : iOq;
    }

    void oq(int i10, int i11, int i12) {
        int mode;
        int size;
        int flexDirection = this.fou.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        } else {
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            mode = mode2;
            size = size2;
        }
        List<bob> flexLinesInternal = this.fou.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.fou.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).rjo = size - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.fou.getAlignContent();
                if (alignContent == 1) {
                    int i14 = size - sumOfCrossSize;
                    bob bobVar = new bob();
                    bobVar.rjo = i14;
                    flexLinesInternal.add(0, bobVar);
                    return;
                }
                if (alignContent == 2) {
                    this.fou.setFlexLines(kq(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i13 < size4) {
                            arrayList.add(flexLinesInternal.get(i13));
                            if (i13 != flexLinesInternal.size() - 1) {
                                bob bobVar2 = new bob();
                                if (i13 == flexLinesInternal.size() - 2) {
                                    bobVar2.rjo = Math.round(f10 + size3);
                                    f10 = 0.0f;
                                } else {
                                    bobVar2.rjo = Math.round(size3);
                                }
                                int i15 = bobVar2.rjo;
                                f10 += size3 - i15;
                                if (f10 > 1.0f) {
                                    bobVar2.rjo = i15 + 1;
                                    f10 -= 1.0f;
                                } else if (f10 < -1.0f) {
                                    bobVar2.rjo = i15 - 1;
                                    f10 += 1.0f;
                                }
                                arrayList.add(bobVar2);
                            }
                            i13++;
                        }
                        this.fou.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.fou.setFlexLines(kq(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    bob bobVar3 = new bob();
                    bobVar3.rjo = size5;
                    for (bob bobVar4 : flexLinesInternal) {
                        arrayList2.add(bobVar3);
                        arrayList2.add(bobVar4);
                        arrayList2.add(bobVar3);
                    }
                    this.fou.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i13 < size7) {
                        bob bobVar5 = flexLinesInternal.get(i13);
                        float f12 = bobVar5.rjo + size6;
                        if (i13 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int iRound = Math.round(f12);
                        f11 += f12 - iRound;
                        if (f11 > 1.0f) {
                            iRound++;
                            f11 -= 1.0f;
                        } else if (f11 < -1.0f) {
                            iRound--;
                            f11 += 1.0f;
                        }
                        bobVar5.rjo = iRound;
                        i13++;
                    }
                }
            }
        }
    }

    private void kq(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.csi.oq oqVar = (com.bytedance.adsdk.ugeno.csi.oq) compoundButton.getLayoutParams();
        int iRjo = oqVar.rjo();
        int iSyt = oqVar.syt();
        Drawable drawableKq = com.bytedance.adsdk.ugeno.rjo.csi.kq(compoundButton);
        int minimumWidth = drawableKq == null ? 0 : drawableKq.getMinimumWidth();
        int minimumHeight = drawableKq != null ? drawableKq.getMinimumHeight() : 0;
        if (iRjo == -1) {
            iRjo = minimumWidth;
        }
        oqVar.kq(iRjo);
        if (iSyt == -1) {
            iSyt = minimumHeight;
        }
        oqVar.oq(iSyt);
    }

    private int kq(boolean z9) {
        if (z9) {
            return this.fou.getPaddingStart();
        }
        return this.fou.getPaddingTop();
    }

    private int kq(View view, boolean z9) {
        if (z9) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private void oq(View view, int i10, int i11) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.csi.oq oqVar = (com.bytedance.adsdk.ugeno.csi.oq) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - oqVar.wki()) - oqVar.nze()) - this.fou.kq(view), oqVar.rjo()), oqVar.dgq());
        long[] jArr = this.rhi;
        if (jArr != null) {
            measuredHeight = oq(jArr[i11]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        kq(i11, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private int kq(com.bytedance.adsdk.ugeno.csi.oq oqVar, boolean z9) {
        if (z9) {
            return oqVar.kq();
        }
        return oqVar.oq();
    }

    private boolean kq(View view, int i10, int i11, int i12, int i13, com.bytedance.adsdk.ugeno.csi.oq oqVar, int i14, int i15, int i16) {
        if (this.fou.getFlexWrap() == 0) {
            return false;
        }
        if (oqVar.ubx()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.fou.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int iKq = this.fou.kq(view, i14, i15);
        if (iKq > 0) {
            i13 += iKq;
        }
        return i11 < i12 + i13;
    }

    private boolean kq(int i10, int i11, bob bobVar) {
        return i10 == i11 - 1 && bobVar.oq() != 0;
    }

    private void kq(List<bob> list, bob bobVar, int i10, int i11) {
        bobVar.wki = i11;
        this.fou.kq(bobVar);
        bobVar.mxq = i10;
        list.add(bobVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void kq(View view, int i10) {
        boolean z9;
        com.bytedance.adsdk.ugeno.csi.oq oqVar = (com.bytedance.adsdk.ugeno.csi.oq) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z10 = true;
        if (measuredWidth < oqVar.rjo()) {
            measuredWidth = oqVar.rjo();
        } else {
            if (measuredWidth > oqVar.dgq()) {
                measuredWidth = oqVar.dgq();
            } else {
                z9 = false;
            }
            if (measuredHeight < oqVar.syt()) {
                measuredHeight = oqVar.syt();
            } else if (measuredHeight > oqVar.nn()) {
                measuredHeight = oqVar.nn();
            } else {
                z10 = z9;
            }
            if (z10) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                kq(i10, iMakeMeasureSpec, iMakeMeasureSpec2, view);
            }
        }
        z9 = true;
        if (measuredHeight < oqVar.syt()) {
            measuredHeight = oqVar.syt();
        } else if (measuredHeight > oqVar.nn()) {
            measuredHeight = oqVar.nn();
        } else {
            z10 = z9;
        }
        if (z10) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            kq(i10, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
        }
    }

    void kq(int i10, int i11) {
        kq(i10, i11, 0);
    }

    void kq(int i10, int i11, int i12) {
        int size;
        int paddingLeft;
        int paddingRight;
        int i13;
        int i14;
        bob(this.fou.getFlexItemCount());
        if (i12 >= this.fou.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.fou.getFlexDirection();
        int flexDirection2 = this.fou.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            int largestMainSize = this.fou.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.fou.getPaddingLeft();
            paddingRight = this.fou.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            size = View.MeasureSpec.getSize(i11);
            if (mode2 != 1073741824) {
                size = this.fou.getLargestMainSize();
            }
            paddingLeft = this.fou.getPaddingTop();
            paddingRight = this.fou.getPaddingBottom();
        }
        int i15 = paddingLeft + paddingRight;
        int i16 = size;
        int[] iArr = this.kq;
        int i17 = iArr != null ? iArr[i12] : 0;
        List<bob> flexLinesInternal = this.fou.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i17 < size2) {
            bob bobVar = flexLinesInternal.get(i17);
            int i18 = bobVar.csi;
            if (i18 < i16 && bobVar.sns) {
                i13 = i10;
                i14 = i11;
                kq(i13, i14, bobVar, i16, i15, false);
            } else {
                i13 = i10;
                i14 = i11;
                if (i18 > i16 && bobVar.wcx) {
                    oq(i13, i14, bobVar, i16, i15, false);
                }
            }
            i17++;
            i10 = i13;
            i11 = i14;
        }
    }

    private void kq(int i10, int i11, bob bobVar, int i12, int i13, boolean z9) {
        int i14;
        float f10;
        float f11;
        int iMax;
        double d10;
        double d11;
        float f12 = bobVar.nn;
        float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f12 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i12 < (i14 = bobVar.csi)) {
            return;
        }
        float f14 = (i12 - i14) / f12;
        bobVar.csi = i13 + bobVar.rhi;
        if (!z9) {
            bobVar.rjo = LinearLayoutManager.INVALID_OFFSET;
        }
        int i15 = 0;
        boolean z10 = false;
        int i16 = 0;
        float f15 = 0.0f;
        while (i15 < bobVar.syt) {
            int i17 = bobVar.nze + i15;
            View viewOq = this.fou.oq(i17);
            if (viewOq == null || viewOq.getVisibility() == 8) {
                f10 = f13;
                f11 = f14;
                z10 = z10;
            } else {
                com.bytedance.adsdk.ugeno.csi.oq oqVar = (com.bytedance.adsdk.ugeno.csi.oq) viewOq.getLayoutParams();
                int flexDirection = this.fou.getFlexDirection();
                f10 = f13;
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewOq.getMeasuredHeight();
                    long[] jArr = this.rhi;
                    if (jArr != null) {
                        measuredHeight = oq(jArr[i17]);
                    }
                    int measuredWidth = viewOq.getMeasuredWidth();
                    long[] jArr2 = this.rhi;
                    f11 = f14;
                    boolean z11 = z10;
                    if (jArr2 != null) {
                        measuredWidth = kq(jArr2[i17]);
                    }
                    if (this.csi[i17] || oqVar.fou() <= f10) {
                        z10 = z11;
                    } else {
                        float fFou = measuredHeight + (oqVar.fou() * f11);
                        if (i15 == bobVar.syt - 1) {
                            fFou += f15;
                            f15 = f10;
                        }
                        int iRound = Math.round(fFou);
                        if (iRound > oqVar.nn()) {
                            iRound = oqVar.nn();
                            this.csi[i17] = true;
                            bobVar.nn -= oqVar.fou();
                            z10 = true;
                        } else {
                            f15 += fFou - iRound;
                            double d12 = f15;
                            if (d12 > 1.0d) {
                                iRound++;
                                d11 = d12 - 1.0d;
                            } else {
                                if (d12 < -1.0d) {
                                    iRound--;
                                    d11 = d12 + 1.0d;
                                }
                                z10 = z11;
                            }
                            f15 = (float) d11;
                            z10 = z11;
                        }
                        int iKq = kq(i10, oqVar, bobVar.wki);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewOq.measure(iKq, iMakeMeasureSpec);
                        int measuredWidth2 = viewOq.getMeasuredWidth();
                        int measuredHeight2 = viewOq.getMeasuredHeight();
                        kq(i17, iKq, iMakeMeasureSpec, viewOq);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i16, measuredWidth + oqVar.wki() + oqVar.nze() + this.fou.kq(viewOq));
                    bobVar.csi += measuredHeight + oqVar.suf() + oqVar.mxq();
                } else {
                    f11 = f14;
                    boolean z12 = z10;
                    int measuredWidth3 = viewOq.getMeasuredWidth();
                    long[] jArr3 = this.rhi;
                    if (jArr3 != null) {
                        measuredWidth3 = kq(jArr3[i17]);
                    }
                    int measuredHeight3 = viewOq.getMeasuredHeight();
                    long[] jArr4 = this.rhi;
                    if (jArr4 != null) {
                        measuredHeight3 = oq(jArr4[i17]);
                    }
                    if (this.csi[i17] || oqVar.fou() <= f10) {
                        z10 = z12;
                    } else {
                        float fFou2 = measuredWidth3 + (oqVar.fou() * f11);
                        if (i15 == bobVar.syt - 1) {
                            fFou2 += f15;
                            f15 = f10;
                        }
                        int iRound2 = Math.round(fFou2);
                        if (iRound2 > oqVar.dgq()) {
                            iRound2 = oqVar.dgq();
                            this.csi[i17] = true;
                            bobVar.nn -= oqVar.fou();
                            z10 = true;
                        } else {
                            f15 += fFou2 - iRound2;
                            double d13 = f15;
                            if (d13 > 1.0d) {
                                iRound2++;
                                d10 = d13 - 1.0d;
                            } else {
                                if (d13 < -1.0d) {
                                    iRound2--;
                                    d10 = d13 + 1.0d;
                                }
                                z10 = z12;
                            }
                            f15 = (float) d10;
                            z10 = z12;
                        }
                        int iOq = oq(i11, oqVar, bobVar.wki);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewOq.measure(iMakeMeasureSpec2, iOq);
                        int measuredWidth4 = viewOq.getMeasuredWidth();
                        int measuredHeight4 = viewOq.getMeasuredHeight();
                        kq(i17, iMakeMeasureSpec2, iOq, viewOq);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i16, measuredHeight3 + oqVar.suf() + oqVar.mxq() + this.fou.kq(viewOq));
                    bobVar.csi += measuredWidth3 + oqVar.wki() + oqVar.nze();
                    iMax = iMax2;
                }
                bobVar.rjo = Math.max(bobVar.rjo, iMax);
                i16 = iMax;
            }
            i15++;
            f14 = f11;
            f13 = f10;
        }
        if (!z10 || i14 == bobVar.csi) {
            return;
        }
        kq(i10, i11, bobVar, i12, i13, true);
    }

    private int kq(int i10, com.bytedance.adsdk.ugeno.csi.oq oqVar, int i11) {
        com.bytedance.adsdk.ugeno.csi.kq kqVar = this.fou;
        int iKq = kqVar.kq(i10, kqVar.getPaddingLeft() + this.fou.getPaddingRight() + oqVar.wki() + oqVar.nze() + i11, oqVar.kq());
        int size = View.MeasureSpec.getSize(iKq);
        if (size > oqVar.dgq()) {
            return View.MeasureSpec.makeMeasureSpec(oqVar.dgq(), View.MeasureSpec.getMode(iKq));
        }
        return size < oqVar.rjo() ? View.MeasureSpec.makeMeasureSpec(oqVar.rjo(), View.MeasureSpec.getMode(iKq)) : iKq;
    }

    private List<bob> kq(List<bob> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        bob bobVar = new bob();
        bobVar.rjo = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(bobVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(bobVar);
            }
        }
        return arrayList;
    }

    void kq() {
        kq(0);
    }

    void kq(int i10) {
        View viewOq;
        if (i10 >= this.fou.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.fou.getFlexDirection();
        if (this.fou.getAlignItems() == 4) {
            int[] iArr = this.kq;
            List<bob> flexLinesInternal = this.fou.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i11 = iArr != null ? iArr[i10] : 0; i11 < size; i11++) {
                bob bobVar = flexLinesInternal.get(i11);
                int i12 = bobVar.syt;
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = bobVar.nze + i13;
                    if (i13 < this.fou.getFlexItemCount() && (viewOq = this.fou.oq(i14)) != null && viewOq.getVisibility() != 8) {
                        com.bytedance.adsdk.ugeno.csi.oq oqVar = (com.bytedance.adsdk.ugeno.csi.oq) viewOq.getLayoutParams();
                        if (oqVar.rhi() == -1 || oqVar.rhi() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                }
                                oq(viewOq, bobVar.rjo, i14);
                            } else {
                                kq(viewOq, bobVar.rjo, i14);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (bob bobVar2 : this.fou.getFlexLinesInternal()) {
            for (Integer num : bobVar2.suf) {
                View viewOq2 = this.fou.oq(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                    }
                    oq(viewOq2, bobVar2.rjo, num.intValue());
                } else {
                    kq(viewOq2, bobVar2.rjo, num.intValue());
                }
            }
        }
    }

    private void kq(View view, int i10, int i11) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.csi.oq oqVar = (com.bytedance.adsdk.ugeno.csi.oq) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - oqVar.suf()) - oqVar.mxq()) - this.fou.kq(view), oqVar.syt()), oqVar.nn());
        long[] jArr = this.rhi;
        if (jArr != null) {
            measuredWidth = kq(jArr[i11]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        kq(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    void kq(View view, bob bobVar, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.csi.oq oqVar = (com.bytedance.adsdk.ugeno.csi.oq) view.getLayoutParams();
        int alignItems = this.fou.getAlignItems();
        if (oqVar.rhi() != -1) {
            alignItems = oqVar.rhi();
        }
        int i14 = bobVar.rjo;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.fou.getFlexWrap() != 2) {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - oqVar.mxq(), i12, i15 - oqVar.mxq());
                    return;
                } else {
                    view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + oqVar.suf(), i12, (i13 - i14) + view.getMeasuredHeight() + oqVar.suf());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i14 - view.getMeasuredHeight()) + oqVar.suf()) - oqVar.mxq()) / 2;
                if (this.fou.getFlexWrap() != 2) {
                    int i16 = i11 + measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else {
                    int i17 = i11 - measuredHeight;
                    view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.fou.getFlexWrap() != 2) {
                    int iMax = Math.max(bobVar.vvw - view.getBaseline(), oqVar.suf());
                    view.layout(i10, i11 + iMax, i12, i13 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((bobVar.vvw - view.getMeasuredHeight()) + view.getBaseline(), oqVar.mxq());
                    view.layout(i10, i11 - iMax2, i12, i13 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.fou.getFlexWrap() != 2) {
            view.layout(i10, i11 + oqVar.suf(), i12, i13 + oqVar.suf());
        } else {
            view.layout(i10, i11 - oqVar.mxq(), i12, i13 - oqVar.mxq());
        }
    }

    void kq(View view, bob bobVar, boolean z9, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.csi.oq oqVar = (com.bytedance.adsdk.ugeno.csi.oq) view.getLayoutParams();
        int alignItems = this.fou.getAlignItems();
        if (oqVar.rhi() != -1) {
            alignItems = oqVar.rhi();
        }
        int i14 = bobVar.rjo;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z9) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - oqVar.nze(), i11, ((i12 + i14) - view.getMeasuredWidth()) - oqVar.nze(), i13);
                    return;
                } else {
                    view.layout((i10 - i14) + view.getMeasuredWidth() + oqVar.wki(), i11, (i12 - i14) + view.getMeasuredWidth() + oqVar.wki(), i13);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i14 - view.getMeasuredWidth()) + com.bytedance.adsdk.ugeno.rjo.rhi.kq(marginLayoutParams)) - com.bytedance.adsdk.ugeno.rjo.rhi.oq(marginLayoutParams)) / 2;
                if (!z9) {
                    view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                    return;
                } else {
                    view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z9) {
            view.layout(i10 + oqVar.wki(), i11, i12 + oqVar.wki(), i13);
        } else {
            view.layout(i10 - oqVar.nze(), i11, i12 - oqVar.nze(), i13);
        }
    }

    private void kq(int i10, int i11, int i12, View view) {
        long[] jArr = this.oq;
        if (jArr != null) {
            jArr[i10] = oq(i11, i12);
        }
        long[] jArr2 = this.rhi;
        if (jArr2 != null) {
            jArr2[i10] = oq(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
