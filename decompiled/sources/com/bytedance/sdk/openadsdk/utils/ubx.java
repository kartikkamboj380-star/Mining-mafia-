package com.bytedance.sdk.openadsdk.utils;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.Pair;
import com.google.android.gms.common.api.Api;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ubx {
    private static final Map<String, Pair<? extends Drawable, Integer>> kq = new HashMap();
    private static Integer oq = null;

    public static Drawable kq(Context context, String str) {
        return kq(context, str, true);
    }

    public static Drawable kq(Context context, String str, boolean z9) {
        Pair<? extends Drawable, Integer> pair;
        oq = Integer.valueOf(com.bytedance.sdk.openadsdk.core.sns.fou().wki());
        "drawable name is: ".concat(String.valueOf(str));
        Map<String, Pair<? extends Drawable, Integer>> map = kq;
        map.size();
        if (!map.containsKey(str) || (pair = map.get(str)) == null) {
            kq();
            return kq(str, context, z9);
        }
        Drawable drawable = (Drawable) pair.first;
        map.put(str, new Pair<>(drawable, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
        return drawable;
    }

    private static Drawable kq(String str, Context context, boolean z9) {
        Drawable layerDrawable;
        Drawable drawableKq;
        str.getClass();
        switch (str) {
            case "tt_leftbackicon_selector_for_dark":
                drawableKq = kq(com.bytedance.sdk.component.utils.uml.bob(context, "tt_lefterbackicon_titlebar_press_for_dark"), com.bytedance.sdk.component.utils.uml.bob(context, "tt_lefterbackicon_titlebar_for_dark"));
                break;
            case "tt_dislike_dialog_bg":
                drawableKq = kq(0, -1, new int[]{bss.oq(context, 8.0f)}, null, null, null);
                break;
            case "tt_leftbackbutton_titlebar_photo_preview":
                drawableKq = kq(com.bytedance.sdk.component.utils.uml.bob(context, "tt_white_lefterbackicon_titlebar_press"), com.bytedance.sdk.component.utils.uml.bob(context, "tt_white_lefterbackicon_titlebar"));
                break;
            case "tt_seek_progress":
                layerDrawable = new LayerDrawable(new Drawable[]{kq(0, Integer.valueOf(Color.parseColor("#A5FFFFFF")), new int[]{bss.oq(context, 1.5f)}, new int[]{-1, bss.oq(context, 1.0f)}, null, null), new ClipDrawable(kq(0, -1, new int[]{bss.oq(context, 1.5f)}, new int[]{-1, bss.oq(context, 1.0f)}, null, null), 8388611, 1), new ClipDrawable(kq(0, Integer.valueOf(Color.parseColor("#fff85959")), new int[]{bss.oq(context, 1.5f)}, new int[]{-1, bss.oq(context, 1.0f)}, null, null), 8388611, 1)});
                drawableKq = layerDrawable;
                break;
            case "tt_dislike_middle_seletor":
                drawableKq = kq(kq(0, Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "tt_fde6e6e6")), null, null, null, null), kq(0, Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "tt_fdffffff")), null, null, null, null));
                break;
            case "tt_ad_cover_btn_begin_bg":
                drawableKq = kq(kq(0, Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "tt_2a90d7")), new int[]{bss.oq(context, 6.0f)}, null, Integer.valueOf(bss.oq(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "@color/tt_7f2a90d7"))), kq(0, Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "tt_2a90d7")), new int[]{bss.oq(context, 6.0f)}, null, Integer.valueOf(bss.oq(context, 1.0f)), Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "@color/tt_2a90d7"))));
                break;
            case "tt_leftbackicon_selector":
                drawableKq = com.bytedance.sdk.component.utils.uml.bob(context, "tt_lefterbackicon_titlebar");
                break;
            case "tt_seek_thumb_normal":
                drawableKq = kq(1, -1, null, new int[]{bss.oq(context, 15.0f), bss.oq(context, 15.0f)}, Integer.valueOf(bss.oq(context, 1.0f)), 0);
                break;
            case "tt_stop_movebar_textpage":
                drawableKq = kq(com.bytedance.sdk.component.utils.uml.bob(context, "tt_new_pause_video_press"), com.bytedance.sdk.component.utils.uml.bob(context, "tt_new_pause_video"));
                break;
            case "tt_backup_btn_1":
                drawableKq = kq(kq(0, Integer.valueOf(Color.parseColor("#33f32830")), new int[]{bss.oq(context, 4.0f)}, null, null, null), kq(0, Integer.valueOf(Color.parseColor("#f32830")), new int[]{bss.oq(context, 4.0f)}, null, null, null));
                break;
            case "tt_ad_report_info_bg":
                drawableKq = kq(0, -1, new int[]{bss.oq(context, 12.0f), bss.oq(context, 12.0f), 0, 0}, null, null, null);
                break;
            case "tt_playable_btn_bk":
                drawableKq = kq(0, Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "tt_00000000")), new int[]{bss.oq(context, 30.0f)}, null, Integer.valueOf(bss.oq(context, 1.0f)), -1);
                break;
            case "tt_dislike_bottom_seletor":
                drawableKq = kq(kq(0, Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "tt_fde6e6e6")), new int[]{0, 0, bss.oq(context, 5.0f), bss.oq(context, 5.0f)}, null, null, null), kq(0, Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "tt_fdffffff")), new int[]{0, 0, bss.oq(context, 5.0f), bss.oq(context, 5.0f)}, null, null, null));
                break;
            case "tt_seek_thumb_fullscreen":
                drawableKq = kq(1, -1, null, new int[]{bss.oq(context, 18.0f), bss.oq(context, 18.0f)}, null, null);
                break;
            case "tt_custom_dialog_bg":
                drawableKq = kq(0, -1, new int[]{bss.oq(context, 6.0f)}, null, Integer.valueOf(bss.oq(context, 0.8f)), -1);
                break;
            case "tt_ad_loading_three_mid":
                drawableKq = kq(0, null, null, null, Integer.valueOf(bss.oq(context, 1.5f)), -1);
                break;
            case "tt_close_move_detail":
                drawableKq = kq(com.bytedance.sdk.component.utils.uml.bob(context, "tt_close_move_details_pressed"), com.bytedance.sdk.component.utils.uml.bob(context, "tt_close_move_details_normal"));
                break;
            case "tt_mute_btn_bg":
                drawableKq = kq(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{bss.oq(context, 28.0f), bss.oq(context, 28.0f)}, null, null);
                break;
            case "tt_seek_thumb":
                drawableKq = kq(kq(1, -1, null, new int[]{bss.oq(context, 22.0f), bss.oq(context, 22.0f)}, Integer.valueOf(bss.oq(context, 1.0f)), 0), kq(1, -1, null, new int[]{bss.oq(context, 15.0f), bss.oq(context, 15.0f)}, Integer.valueOf(bss.oq(context, 1.0f)), 0));
                break;
            case "tt_reward_countdown_bg":
                drawableKq = kq(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{bss.oq(context, 28.0f), bss.oq(context, 28.0f)}, null, null);
                break;
            case "tt_play_movebar_textpage":
                drawableKq = kq(com.bytedance.sdk.component.utils.uml.bob(context, "tt_new_play_video"), com.bytedance.sdk.component.utils.uml.bob(context, "tt_new_play_video"));
                break;
            case "tt_refreshing_video_textpage":
                drawableKq = kq(com.bytedance.sdk.component.utils.uml.bob(context, "tt_refreshing_video_textpage_pressed"), com.bytedance.sdk.component.utils.uml.bob(context, "tt_refreshing_video_textpage_normal"));
                break;
            case "tt_playable_progress_style":
                layerDrawable = new LayerDrawable(new Drawable[]{kq(0, Integer.valueOf(Color.parseColor("#4DFC625C")), new int[]{bss.oq(context, 3.0f)}, null, null, null), new ClipDrawable(kq(0, Integer.valueOf(Color.parseColor("#FC625C")), new int[]{bss.oq(context, 3.0f)}, null, null, null), 8388611, 1)});
                drawableKq = layerDrawable;
                break;
            case "tt_seek_thumb_fullscreen_selector":
                drawableKq = kq(kq(1, -1, null, new int[]{bss.oq(context, 18.0f), bss.oq(context, 18.0f)}, Integer.valueOf(bss.oq(context, 1.0f)), 0), kq(1, -1, null, new int[]{bss.oq(context, 18.0f), bss.oq(context, 18.0f)}, Integer.valueOf(bss.oq(context, 1.0f)), 0));
                break;
            case "tt_ad_landing_loading_three_mid":
                drawableKq = kq(0, null, null, null, Integer.valueOf(bss.oq(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_pangle_ad_mute_btn_bg":
                drawableKq = kq(1, Integer.valueOf(Color.parseColor("#99333333")), null, new int[]{bss.oq(context, 28.0f), bss.oq(context, 28.0f)}, null, null);
                break;
            case "tt_video_black_desc_gradient":
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setColors(new int[]{com.bytedance.sdk.component.utils.uml.rjo(context, "tt_ff1a1a1a"), com.bytedance.sdk.component.utils.uml.rjo(context, "tt_00000000")});
                gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                layerDrawable = gradientDrawable;
                drawableKq = layerDrawable;
                break;
            case "tt_ad_loading_three_left":
                drawableKq = kq(0, null, new int[]{bss.oq(context, 6.0f), 0, 0, bss.oq(context, 6.0f)}, null, Integer.valueOf(bss.oq(context, 1.5f)), -1);
                break;
            case "tt_mute_wrapper":
                Drawable drawableBob = com.bytedance.sdk.component.utils.uml.bob(context, "tt_mute");
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[0], drawableBob);
                stateListDrawable.setAutoMirrored(true);
                layerDrawable = stateListDrawable;
                drawableKq = layerDrawable;
                break;
            case "tt_dislike_top_bg":
                drawableKq = kq(0, Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "tt_fdffffff")), new int[]{bss.oq(context, 5.0f), bss.oq(context, 5.0f), 0, 0}, null, null, null);
                break;
            case "tt_comment_tv":
                drawableKq = kq(0, -1, new int[]{bss.oq(context, 4.0f)}, null, Integer.valueOf(bss.oq(context, 1.0f)), Integer.valueOf(Color.parseColor("#0F161823")));
                break;
            case "tt_reward_full_new_bar_bg":
                drawableKq = kq(0, Integer.valueOf(Color.parseColor("#ccffffff")), new int[]{bss.oq(context, 18.0f)}, null, null, null);
                break;
            case "tt_reward_full_video_backup_btn_bg":
                drawableKq = kq(0, Integer.valueOf(Color.parseColor("#ff0088ff")), new int[]{bss.oq(context, 6.0f)}, null, null, null);
                break;
            case "tt_full_reward_loading_progress_style":
                GradientDrawable gradientDrawableKq = kq(0, Integer.valueOf(Color.parseColor("#EAEAEA")), new int[]{bss.oq(context, 50.0f)}, null, null, null);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(bss.oq(context, 15.0f));
                gradientDrawable2.setColors(new int[]{Color.parseColor("#1A73E8"), Color.parseColor("#569FFF")});
                gradientDrawable2.setGradientType(0);
                gradientDrawable2.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                drawableKq = new LayerDrawable(new Drawable[]{gradientDrawableKq, new ScaleDrawable(gradientDrawable2, 8388611, 1.0f, -1.0f)});
                break;
            case "tt_detail_video_btn_bg":
                drawableKq = kq(0, Integer.valueOf(Color.parseColor("#26000000")), new int[]{bss.oq(context, 4.0f)}, null, null, null);
                break;
            case "tt_pangle_banner_btn_bg":
                drawableKq = kq(0, Integer.valueOf(Color.parseColor("#ff2f87f8")), new int[]{bss.oq(context, 2.0f)}, new int[]{bss.oq(context, 98.0f), bss.oq(context, 25.0f)}, null, null);
                break;
            case "tt_seek_thumb_fullscreen_press":
                drawableKq = kq(1, -1, null, new int[]{bss.oq(context, 18.0f), bss.oq(context, 18.0f)}, Integer.valueOf(bss.oq(context, 1.0f)), 0);
                break;
            case "tt_browser_download_selector":
                drawableKq = kq(kq(0, Integer.valueOf(Color.parseColor("#2582c3")), null, null, null, null), kq(0, Integer.valueOf(Color.parseColor("#2a90d7")), null, null, null, null));
                break;
            case "tt_ad_loading_three_right":
                drawableKq = kq(0, null, new int[]{0, bss.oq(context, 6.0f), bss.oq(context, 6.0f), 0}, null, Integer.valueOf(bss.oq(context, 1.5f)), -1);
                break;
            case "tt_pangle_btn_bg":
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setShape(0);
                gradientDrawable3.setSize(bss.oq(context, 280.0f), bss.oq(context, 38.0f));
                gradientDrawable3.setCornerRadius(bss.oq(context, 19.0f));
                gradientDrawable3.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable3.setColors(new int[]{Color.parseColor("#fff02d42"), Color.parseColor("#fffc4b3c")});
                gradientDrawable3.setGradientType(0);
                gradientDrawable3.setUseLevel(true);
                layerDrawable = gradientDrawable3;
                drawableKq = layerDrawable;
                break;
            case "tt_privacy_progress_style":
                drawableKq = new LayerDrawable(new Drawable[]{kq(0, Integer.valueOf(Color.parseColor("#33007AFF")), null, null, null, null), new ClipDrawable(kq(0, Integer.valueOf(Color.parseColor("#007AFF")), null, null, null, null), 8388611, 1)});
                break;
            case "tt_privacy_btn_bg":
                GradientDrawable gradientDrawable4 = new GradientDrawable();
                gradientDrawable4.setShape(0);
                gradientDrawable4.setSize(bss.oq(context, 258.0f), bss.oq(context, 43.0f));
                gradientDrawable4.setCornerRadius(bss.oq(context, 22.0f));
                gradientDrawable4.setColors(new int[]{Color.parseColor("#73CBFC"), Color.parseColor("#3F9CF7")});
                gradientDrawable4.setGradientType(0);
                layerDrawable = gradientDrawable4;
                drawableKq = layerDrawable;
                break;
            case "tt_seek_thumb_press":
                drawableKq = kq(1, -1, null, new int[]{bss.oq(context, 22.0f), bss.oq(context, 22.0f)}, Integer.valueOf(bss.oq(context, 1.0f)), 0);
                break;
            case "tt_unmute_wrapper":
                Drawable drawableBob2 = com.bytedance.sdk.component.utils.uml.bob(context, "tt_unmute");
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                stateListDrawable2.addState(new int[0], drawableBob2);
                stateListDrawable2.setAutoMirrored(true);
                layerDrawable = stateListDrawable2;
                drawableKq = layerDrawable;
                break;
            case "tt_titlebar_close_seletor_for_dark":
                drawableKq = kq(com.bytedance.sdk.component.utils.uml.bob(context, "tt_titlebar_close_press_for_dark"), com.bytedance.sdk.component.utils.uml.bob(context, "tt_titlebar_close_for_dark"));
                break;
            case "tt_ad_landing_loading_three_right":
                drawableKq = kq(0, null, new int[]{0, bss.oq(context, 6.0f), bss.oq(context, 6.0f), 0}, null, Integer.valueOf(bss.oq(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_landingpage_loading_text_rect":
                drawableKq = kq(0, Integer.valueOf(Color.parseColor("#141A73E8")), new int[]{bss.oq(context, 5.0f)}, null, null, null);
                break;
            case "tt_shadow_btn_back_withoutnight":
                Drawable drawableBob3 = com.bytedance.sdk.component.utils.uml.bob(context, "tt_shadow_lefterback_titlebar_press_withoutnight");
                StateListDrawable stateListDrawableKq = kq(drawableBob3, com.bytedance.sdk.component.utils.uml.bob(context, "tt_shadow_lefterback_titlebar_withoutnight"));
                stateListDrawableKq.addState(new int[]{-16842910}, drawableBob3);
                drawableKq = stateListDrawableKq;
                break;
            case "tt_circle_solid_mian":
                drawableKq = kq(1, Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "tt_e0e0e0")), null, null, null, null);
                break;
            case "tt_browser_progress_style":
                drawableKq = new LayerDrawable(new Drawable[]{kq(0, -1, new int[]{0}, null, null, null), new ClipDrawable(kq(0, Integer.valueOf(Color.parseColor("#1A73E8")), new int[]{0}, null, null, null), 3, 1)});
                break;
            case "tt_download_corner_bg":
                drawableKq = kq(0, Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "tt_4a90e2")), new int[]{bss.oq(context, 4.0f)}, null, null, null);
                break;
            case "tt_ad_report_info_button_bg":
                drawableKq = kq(kq(0, Integer.valueOf(Color.parseColor("#0D000000")), new int[]{bss.oq(context, 2.0f)}, null, Integer.valueOf(bss.oq(context, 1.0f)), Integer.valueOf(Color.parseColor("#1F000000"))), kq(0, -1, new int[]{bss.oq(context, 2.0f)}, null, Integer.valueOf(bss.oq(context, 1.0f)), Integer.valueOf(Color.parseColor("#1618231F"))));
                break;
            case "tt_ad_landing_loading_three_left":
                drawableKq = kq(0, null, new int[]{bss.oq(context, 6.0f), 0, 0, bss.oq(context, 6.0f)}, null, Integer.valueOf(bss.oq(context, 1.5f)), Integer.valueOf(Color.parseColor("#ABACB0")));
                break;
            case "tt_pangle_ad_close_btn_bg":
                drawableKq = kq(1, Integer.valueOf(Color.parseColor("#30333333")), null, new int[]{bss.oq(context, 28.0f), bss.oq(context, 28.0f)}, null, null);
                break;
            case "tt_lefterbackicon_titlebar_press_wrapper":
                Drawable drawableBob4 = com.bytedance.sdk.component.utils.uml.bob(context, "tt_lefterbackicon_titlebar_press");
                StateListDrawable stateListDrawable3 = new StateListDrawable();
                stateListDrawable3.addState(new int[0], drawableBob4);
                stateListDrawable3.setAutoMirrored(true);
                layerDrawable = stateListDrawable3;
                drawableKq = layerDrawable;
                break;
            case "tt_reward_video_download_btn_bg":
                drawableKq = kq(0, Integer.valueOf(Color.parseColor("#ff007aff")), new int[]{bss.oq(context, 18.0f)}, null, null, null);
                break;
            case "tt_ad_loading_rect":
                drawableKq = kq(0, Integer.valueOf(Color.parseColor("#33FFFFFF")), new int[]{bss.oq(context, 15.0f)}, null, null, null);
                break;
            case "tt_shadow_btn_back":
                Drawable drawableBob5 = com.bytedance.sdk.component.utils.uml.bob(context, "tt_shadow_lefterback_titlebar_press");
                StateListDrawable stateListDrawableKq2 = kq(drawableBob5, com.bytedance.sdk.component.utils.uml.bob(context, "tt_shadow_lefterback_titlebar"));
                stateListDrawableKq2.addState(new int[]{-16842910}, drawableBob5);
                drawableKq = stateListDrawableKq2;
                break;
            case "tt_dislike_top_seletor":
                drawableKq = kq(kq(0, Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "tt_fde6e6e6")), new int[]{bss.oq(context, 5.0f), bss.oq(context, 5.0f), 0, 0}, null, null, null), kq(0, Integer.valueOf(com.bytedance.sdk.component.utils.uml.rjo(context, "tt_fdffffff")), new int[]{bss.oq(context, 5.0f), bss.oq(context, 5.0f), 0, 0}, null, null, null));
                break;
            case "tt_video_loading_progress_bar":
                RotateDrawable rotateDrawable = new RotateDrawable();
                rotateDrawable.setDrawable(com.bytedance.sdk.component.utils.uml.bob(context, "tt_normalscreen_loading"));
                rotateDrawable.setFromDegrees(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                rotateDrawable.setToDegrees(360.0f);
                rotateDrawable.setPivotX(0.5f);
                rotateDrawable.setPivotY(0.5f);
                layerDrawable = rotateDrawable;
                drawableKq = layerDrawable;
                break;
            case "tt_ad_skip_btn_bg2":
                drawableKq = kq(0, Integer.valueOf(Color.parseColor("#66161823")), new int[]{bss.oq(context, 14.0f)}, null, null, null);
                break;
            case "tt_privacy_webview_bg":
                drawableKq = kq(0, -1, new int[]{bss.oq(context, 14.5f)}, null, null, null);
                break;
            case "tt_titlebar_close_seletor":
                drawableKq = com.bytedance.sdk.component.utils.uml.bob(context, "tt_titlebar_close_drawable");
                break;
            default:
                drawableKq = null;
                break;
        }
        if (z9) {
            kq.put(str, new Pair<>(drawableKq, 1));
        }
        return drawableKq;
    }

    private static void kq() {
        Map<String, Pair<? extends Drawable, Integer>> map = kq;
        if (map.size() < oq.intValue()) {
            return;
        }
        String key = null;
        int iIntValue = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (Map.Entry<String, Pair<? extends Drawable, Integer>> entry : map.entrySet()) {
            if (((Integer) entry.getValue().second).intValue() < iIntValue) {
                key = entry.getKey();
                iIntValue = ((Integer) entry.getValue().second).intValue();
                if (iIntValue == 1) {
                    break;
                }
            }
        }
        kq.remove(key);
    }

    private static GradientDrawable kq(int i10, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i10);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        int length = iArr != null ? iArr.length : 0;
        if (length == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (length == 4) {
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i11, i11, i12, i12, i13, i13, i14, i14});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }

    private static StateListDrawable kq(Drawable drawable, Drawable drawable2) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (drawable != null) {
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawable);
        }
        if (drawable2 != null) {
            stateListDrawable.addState(new int[0], drawable2);
        }
        return stateListDrawable;
    }

    public static Drawable kq(Context context, int i10) {
        return kq(context, Color.parseColor("#1A73E8"), i10);
    }

    public static Drawable kq(Context context, int i10, int i11) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(bss.oq(context, i11));
        return gradientDrawable;
    }
}
