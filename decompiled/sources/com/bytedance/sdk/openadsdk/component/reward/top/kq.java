package com.bytedance.sdk.openadsdk.component.reward.top;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.uml;

/* JADX INFO: loaded from: classes.dex */
public interface kq<T extends View> {
    void clickSkip();

    void clickSound(String str);

    View getCloseButton();

    void setCountDownFor1InN(CharSequence charSequence, int i10);

    void setListener(oq oqVar);

    void setShowDislike(boolean z9);

    void setShowEndCardNextAd(boolean z9, uml umlVar);

    void setShowPlayableNextAd(boolean z9, uml umlVar);

    void setShowSkip(boolean z9);

    void setShowSound(boolean z9);

    void setSkipEnable(boolean z9);

    void setSkipInvisiable();

    void setSkipText(CharSequence charSequence);

    void setSoundMute(boolean z9);

    void setTime(CharSequence charSequence, CharSequence charSequence2);

    void showCloseButton();

    void showCountDownText();

    void showSkipButton();
}
