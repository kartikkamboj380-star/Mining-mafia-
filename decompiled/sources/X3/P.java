package X3;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.AbstractC1359h;
import com.facebook.react.uimanager.BaseViewManager;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes2.dex */
public class P extends AbstractC1359h {
    public P(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.AbstractC1359h, com.facebook.react.uimanager.U0
    public void a(View view, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals("opacity")) {
                    b10 = 0;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b10 = 1;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b10 = 2;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b10 = 3;
                }
                break;
            case -293492298:
                if (str.equals("pointerEvents")) {
                    b10 = 4;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b10 = 5;
                }
                break;
            case 3373707:
                if (str.equals(MediationMetaData.KEY_NAME)) {
                    b10 = 6;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b10 = 7;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b10 = 8;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b10 = 9;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    b10 = 10;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b10 = 11;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.f15703a.setOpacity(view, obj == null ? 1.0f : ((Double) obj).floatValue());
                break;
            case 1:
                ((Q) this.f15703a).setMatrix(view, (ReadableArray) obj);
                break;
            case 2:
                ((Q) this.f15703a).setMarkerEnd(view, obj != null ? (String) obj : null);
                break;
            case 3:
                ((Q) this.f15703a).setMarkerMid(view, obj != null ? (String) obj : null);
                break;
            case 4:
                ((Q) this.f15703a).setPointerEvents(view, obj != null ? (String) obj : null);
                break;
            case 5:
                ((Q) this.f15703a).setMask(view, obj != null ? (String) obj : null);
                break;
            case 6:
                ((Q) this.f15703a).setName(view, obj != null ? (String) obj : null);
                break;
            case 7:
                ((Q) this.f15703a).setMarkerStart(view, obj != null ? (String) obj : null);
                break;
            case 8:
                ((Q) this.f15703a).setClipPath(view, obj != null ? (String) obj : null);
                break;
            case 9:
                ((Q) this.f15703a).setClipRule(view, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 10:
                ((Q) this.f15703a).setDisplay(view, obj != null ? (String) obj : null);
                break;
            case 11:
                ((Q) this.f15703a).setResponsible(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.a(view, str, obj);
                break;
        }
    }
}
