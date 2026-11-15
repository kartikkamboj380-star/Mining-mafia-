package O1;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.ConnectionResult;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.DescriptorProtos;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4315d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private O1.g f4312a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private O1.g.J f4313b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4314c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4316e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f4317f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private StringBuilder f4318g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4319h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private StringBuilder f4320i = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4322b;

        static {
            int[] iArr = new int[g.values().length];
            f4322b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4322b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4322b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4322b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4322b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4322b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4322b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4322b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4322b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4322b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4322b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4322b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4322b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4322b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4322b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4322b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4322b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4322b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f4322b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4322b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4322b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4322b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4322b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4322b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f4322b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4322b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4322b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f4322b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f4322b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f4322b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f4322b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f4322b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f4322b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f4322b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f4322b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f4322b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f4322b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f4322b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f4322b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f4322b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f4322b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f4322b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f4322b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f4322b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f4322b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f4322b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f4322b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f4322b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f4322b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f4322b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f4322b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f4322b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f4322b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f4322b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f4322b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f4322b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f4322b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f4322b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f4322b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f4322b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f4322b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f4322b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f4322b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f4322b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f4322b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f4322b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f4322b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f4322b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f4322b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f4322b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f4322b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f4322b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f4322b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f4322b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f4322b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f4322b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f4322b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f4322b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f4322b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f4322b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f4322b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f4322b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f4322b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f4322b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f4322b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f4322b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f4322b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f4322b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f4322b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f4321a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f4321a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f4321a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f4321a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f4321a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f4321a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f4321a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f4321a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f4321a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f4321a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f4321a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f4321a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f4321a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f4321a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f4321a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f4321a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f4321a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f4321a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f4321a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f4321a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f4321a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f4321a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f4321a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f4321a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f4321a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f4321a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f4321a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f4321a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f4321a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f4321a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f4321a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f4323a;

        static {
            HashMap map = new HashMap(10);
            f4323a = map;
            map.put("none", O1.e.a.none);
            map.put("xMinYMin", O1.e.a.xMinYMin);
            map.put("xMidYMin", O1.e.a.xMidYMin);
            map.put("xMaxYMin", O1.e.a.xMaxYMin);
            map.put("xMinYMid", O1.e.a.xMinYMid);
            map.put("xMidYMid", O1.e.a.xMidYMid);
            map.put("xMaxYMid", O1.e.a.xMaxYMid);
            map.put("xMinYMax", O1.e.a.xMinYMax);
            map.put("xMidYMax", O1.e.a.xMidYMax);
            map.put("xMaxYMax", O1.e.a.xMaxYMax);
        }

        static O1.e.a a(String str) {
            return (O1.e.a) f4323a.get(str);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f4324a;

        static {
            HashMap map = new HashMap(47);
            f4324a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", -16777216);
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", -65536);
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        static Integer a(String str) {
            return (Integer) f4324a.get(str);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f4325a;

        static {
            HashMap map = new HashMap(9);
            f4325a = map;
            O1.g.d0 d0Var = O1.g.d0.pt;
            map.put("xx-small", new O1.g.C0905p(0.694f, d0Var));
            map.put("x-small", new O1.g.C0905p(0.833f, d0Var));
            map.put("small", new O1.g.C0905p(10.0f, d0Var));
            map.put("medium", new O1.g.C0905p(12.0f, d0Var));
            map.put("large", new O1.g.C0905p(14.4f, d0Var));
            map.put("x-large", new O1.g.C0905p(17.3f, d0Var));
            map.put("xx-large", new O1.g.C0905p(20.7f, d0Var));
            O1.g.d0 d0Var2 = O1.g.d0.percent;
            map.put("smaller", new O1.g.C0905p(83.33f, d0Var2));
            map.put("larger", new O1.g.C0905p(120.0f, d0Var2));
        }

        static O1.g.C0905p a(String str) {
            return (O1.g.C0905p) f4325a.get(str);
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f4326a;

        static {
            HashMap map = new HashMap(13);
            f4326a = map;
            Integer numValueOf = Integer.valueOf(CommonGatewayClient.CODE_400);
            map.put("normal", numValueOf);
            map.put("bold", 700);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put(StatisticData.ERROR_CODE_NOT_FOUND, 100);
            map.put("200", Integer.valueOf(TTAdConstant.MATE_VALID));
            map.put("300", 300);
            map.put("400", numValueOf);
            map.put("500", Integer.valueOf(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE));
            map.put("600", 600);
            map.put("700", 700);
            map.put("800", 800);
            map.put("900", 900);
        }

        static Integer a(String str) {
            return (Integer) f4326a.get(str);
        }
    }

    private class f extends DefaultHandler2 {
        private f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            k.this.c1(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            k.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            k.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            k.this.r(str, k.this.x0(new i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            k.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws O1.j {
            k.this.X0(str, str2, str3, attributes);
        }

        /* synthetic */ f(k kVar, a aVar) {
            this();
        }
    }

    private enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;


        /* JADX INFO: renamed from: f1, reason: collision with root package name */
        private static final Map f4391f1 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    f4391f1.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    f4391f1.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        public static g c(String str) {
            g gVar = (g) f4391f1.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    private enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;


        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private static final Map f4439X = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    f4439X.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    f4439X.put(hVar.name(), hVar);
                }
            }
        }

        public static h c(String str) {
            h hVar = (h) f4439X.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f4456a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4458c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4457b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private O1.d f4459d = new O1.d();

        i(String str) {
            this.f4458c = 0;
            String strTrim = str.trim();
            this.f4456a = strTrim;
            this.f4458c = strTrim.length();
        }

        void A() {
            while (true) {
                int i10 = this.f4457b;
                if (i10 >= this.f4458c || !k(this.f4456a.charAt(i10))) {
                    return;
                } else {
                    this.f4457b++;
                }
            }
        }

        int a() {
            int i10 = this.f4457b;
            int i11 = this.f4458c;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.f4457b = i12;
            if (i12 < i11) {
                return this.f4456a.charAt(i12);
            }
            return -1;
        }

        String b() {
            int i10 = this.f4457b;
            while (!h() && !k(this.f4456a.charAt(this.f4457b))) {
                this.f4457b++;
            }
            String strSubstring = this.f4456a.substring(i10, this.f4457b);
            this.f4457b = i10;
            return strSubstring;
        }

        Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        float d(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        boolean f(char c10) {
            int i10 = this.f4457b;
            boolean z9 = i10 < this.f4458c && this.f4456a.charAt(i10) == c10;
            if (z9) {
                this.f4457b++;
            }
            return z9;
        }

        boolean g(String str) {
            int length = str.length();
            int i10 = this.f4457b;
            boolean z9 = i10 <= this.f4458c - length && this.f4456a.substring(i10, i10 + length).equals(str);
            if (z9) {
                this.f4457b += length;
            }
            return z9;
        }

        boolean h() {
            return this.f4457b == this.f4458c;
        }

        boolean i() {
            int i10 = this.f4457b;
            if (i10 == this.f4458c) {
                return false;
            }
            char cCharAt = this.f4456a.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'z') {
                return cCharAt >= 'A' && cCharAt <= 'Z';
            }
            return true;
        }

        boolean j(int i10) {
            return i10 == 10 || i10 == 13;
        }

        boolean k(int i10) {
            return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
        }

        Integer l() {
            int i10 = this.f4457b;
            if (i10 == this.f4458c) {
                return null;
            }
            String str = this.f4456a;
            this.f4457b = i10 + 1;
            return Integer.valueOf(str.charAt(i10));
        }

        Boolean m() {
            int i10 = this.f4457b;
            if (i10 == this.f4458c) {
                return null;
            }
            char cCharAt = this.f4456a.charAt(i10);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f4457b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        float n() {
            float fB = this.f4459d.b(this.f4456a, this.f4457b, this.f4458c);
            if (!Float.isNaN(fB)) {
                this.f4457b = this.f4459d.a();
            }
            return fB;
        }

        String o() {
            if (h()) {
                return null;
            }
            int i10 = this.f4457b;
            int iCharAt = this.f4456a.charAt(i10);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = a();
            }
            int i11 = this.f4457b;
            while (k(iCharAt)) {
                iCharAt = a();
            }
            if (iCharAt == 40) {
                this.f4457b++;
                return this.f4456a.substring(i10, i11);
            }
            this.f4457b = i10;
            return null;
        }

        O1.g.C0905p p() {
            float fN = n();
            if (Float.isNaN(fN)) {
                return null;
            }
            O1.g.d0 d0VarV = v();
            return d0VarV == null ? new O1.g.C0905p(fN, O1.g.d0.px) : new O1.g.C0905p(fN, d0VarV);
        }

        String q() {
            if (h()) {
                return null;
            }
            int i10 = this.f4457b;
            char cCharAt = this.f4456a.charAt(i10);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.f4457b = i10;
                return null;
            }
            int i11 = this.f4457b;
            this.f4457b = i11 + 1;
            return this.f4456a.substring(i10 + 1, i11);
        }

        String r() {
            return t(' ', false);
        }

        String s(char c10) {
            return t(c10, false);
        }

        String t(char c10, boolean z9) {
            if (h()) {
                return null;
            }
            char cCharAt = this.f4456a.charAt(this.f4457b);
            if ((!z9 && k(cCharAt)) || cCharAt == c10) {
                return null;
            }
            int i10 = this.f4457b;
            int iA = a();
            while (iA != -1 && iA != c10 && (z9 || !k(iA))) {
                iA = a();
            }
            return this.f4456a.substring(i10, this.f4457b);
        }

        String u(char c10) {
            return t(c10, true);
        }

        O1.g.d0 v() {
            if (h()) {
                return null;
            }
            if (this.f4456a.charAt(this.f4457b) == '%') {
                this.f4457b++;
                return O1.g.d0.percent;
            }
            int i10 = this.f4457b;
            if (i10 > this.f4458c - 2) {
                return null;
            }
            try {
                O1.g.d0 d0VarValueOf = O1.g.d0.valueOf(this.f4456a.substring(i10, i10 + 2).toLowerCase(Locale.US));
                this.f4457b += 2;
                return d0VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        String w() {
            if (h()) {
                return null;
            }
            int i10 = this.f4457b;
            char cCharAt = this.f4456a.charAt(i10);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.f4457b = i10;
                return null;
            }
            int iA = a();
            while (true) {
                if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                    break;
                }
                iA = a();
            }
            return this.f4456a.substring(i10, this.f4457b);
        }

        float x() {
            z();
            float fB = this.f4459d.b(this.f4456a, this.f4457b, this.f4458c);
            if (!Float.isNaN(fB)) {
                this.f4457b = this.f4459d.a();
            }
            return fB;
        }

        String y() {
            if (h()) {
                return null;
            }
            int i10 = this.f4457b;
            this.f4457b = this.f4458c;
            return this.f4456a.substring(i10);
        }

        boolean z() {
            A();
            int i10 = this.f4457b;
            if (i10 == this.f4458c || this.f4456a.charAt(i10) != ',') {
                return false;
            }
            this.f4457b++;
            A();
            return true;
        }
    }

    private class j implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private XmlPullParser f4460a;

        public j(XmlPullParser xmlPullParser) {
            this.f4460a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f4460a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i10) {
            return this.f4460a.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i10) {
            String attributeName = this.f4460a.getAttributeName(i10);
            if (this.f4460a.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return this.f4460a.getAttributePrefix(i10) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i10) {
            return this.f4460a.getAttributeNamespace(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i10) {
            return this.f4460a.getAttributeValue(i10);
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }
    }

    k() {
    }

    private void A(O1.g.C0894d c0894d, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()]) {
                case 12:
                    c0894d.f4177o = o0(strTrim);
                    break;
                case 13:
                    c0894d.f4178p = o0(strTrim);
                    break;
                case 14:
                    O1.g.C0905p c0905pO0 = o0(strTrim);
                    c0894d.f4179q = c0905pO0;
                    if (c0905pO0.h()) {
                        throw new O1.j("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    private static Set A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            hashSet.add(iVar.r());
            iVar.A();
        }
        return hashSet;
    }

    private void B(O1.g.C0895e c0895e, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    c0895e.f4190p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new O1.j("Invalid value for attribute clipPathUnits");
                    }
                    c0895e.f4190p = Boolean.TRUE;
                }
            }
        }
    }

    private static O1.g.C0905p[] B0(String str) {
        O1.g.C0905p c0905pP;
        i iVar = new i(str);
        iVar.A();
        if (iVar.h() || (c0905pP = iVar.p()) == null || c0905pP.h()) {
            return null;
        }
        float fB = c0905pP.b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c0905pP);
        while (!iVar.h()) {
            iVar.z();
            O1.g.C0905p c0905pP2 = iVar.p();
            if (c0905pP2 == null || c0905pP2.h()) {
                return null;
            }
            arrayList.add(c0905pP2);
            fB += c0905pP2.b();
        }
        if (fB == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return null;
        }
        return (O1.g.C0905p[]) arrayList.toArray(new O1.g.C0905p[arrayList.size()]);
    }

    private void C(O1.g.G g10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()]) {
                case 21:
                    g10.f(z0(strTrim));
                    break;
                case 22:
                    g10.i(strTrim);
                    break;
                case 23:
                    g10.g(F0(strTrim));
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    g10.h(A0(strTrim));
                    break;
                case 25:
                    List listI0 = i0(strTrim);
                    g10.d(listI0 != null ? new HashSet(listI0) : new HashSet(0));
                    break;
            }
        }
    }

    private static O1.g.E.c C0(String str) {
        if ("butt".equals(str)) {
            return O1.g.E.c.Butt;
        }
        if ("round".equals(str)) {
            return O1.g.E.c.Round;
        }
        if ("square".equals(str)) {
            return O1.g.E.c.Square;
        }
        return null;
    }

    private void D(O1.g.L l10, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l10.f4137c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if (BuildConfig.FLAVOR.equals(strTrim)) {
                    l10.f4138d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        l10.f4138d = Boolean.TRUE;
                        return;
                    }
                    throw new O1.j("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    private static O1.g.E.d D0(String str) {
        if ("miter".equals(str)) {
            return O1.g.E.d.Miter;
        }
        if ("round".equals(str)) {
            return O1.g.E.d.Round;
        }
        if ("bevel".equals(str)) {
            return O1.g.E.d.Bevel;
        }
        return null;
    }

    private void E(O1.g.C0898i c0898i, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()]) {
                case 10:
                    O1.g.C0905p c0905pO0 = o0(strTrim);
                    c0898i.f4202q = c0905pO0;
                    if (c0905pO0.h()) {
                        throw new O1.j("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    O1.g.C0905p c0905pO1 = o0(strTrim);
                    c0898i.f4203r = c0905pO1;
                    if (c0905pO1.h()) {
                        throw new O1.j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    c0898i.f4200o = o0(strTrim);
                    break;
                case 13:
                    c0898i.f4201p = o0(strTrim);
                    break;
            }
        }
    }

    private static void E0(O1.g.L l10, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strS = iVar.s(':');
            iVar.A();
            if (!iVar.f(':')) {
                return;
            }
            iVar.A();
            String strU = iVar.u(';');
            if (strU == null) {
                return;
            }
            iVar.A();
            if (iVar.h() || iVar.f(';')) {
                if (l10.f4140f == null) {
                    l10.f4140f = new O1.g.E();
                }
                S0(l10.f4140f, strS, strU);
                iVar.A();
            }
        }
    }

    private void F(O1.g.AbstractC0899j abstractC0899j, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                switch (i11) {
                    case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new O1.j("Invalid value for attribute gradientUnits");
                            }
                            abstractC0899j.f4205i = Boolean.TRUE;
                        } else {
                            abstractC0899j.f4205i = Boolean.FALSE;
                        }
                        break;
                    case 33:
                        abstractC0899j.f4206j = J0(strTrim);
                        break;
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        try {
                            abstractC0899j.f4207k = O1.g.EnumC0900k.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new O1.j("Invalid spreadMethod attribute. \"" + strTrim + "\" is not a valid value.");
                        }
                        break;
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                abstractC0899j.f4208l = strTrim;
            }
        }
    }

    private static Set F0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            int iIndexOf = strR.indexOf(45);
            if (iIndexOf != -1) {
                strR = strR.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strR, "", "").getLanguage());
            iVar.A();
        }
        return hashSet;
    }

    private void G(O1.g.C0904o c0904o, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c0904o.f4216q = o0(strTrim);
            } else if (i11 == 2) {
                c0904o.f4217r = o0(strTrim);
            } else if (i11 == 3) {
                O1.g.C0905p c0905pO0 = o0(strTrim);
                c0904o.f4218s = c0905pO0;
                if (c0905pO0.h()) {
                    throw new O1.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                O1.g.C0905p c0905pO1 = o0(strTrim);
                c0904o.f4219t = c0905pO1;
                if (c0905pO1.h()) {
                    throw new O1.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                if (i11 == 7) {
                    w0(c0904o, strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                c0904o.f4215p = strTrim;
            }
        }
    }

    private static O1.g.E.f G0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return O1.g.E.f.Middle;
            case "end":
                return O1.g.E.f.End;
            case "start":
                return O1.g.E.f.Start;
            default:
                return null;
        }
    }

    private void H(O1.g.C0906q c0906q, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    c0906q.f4223o = o0(strTrim);
                    break;
                case 16:
                    c0906q.f4224p = o0(strTrim);
                    break;
                case 17:
                    c0906q.f4225q = o0(strTrim);
                    break;
                case 18:
                    c0906q.f4226r = o0(strTrim);
                    break;
            }
        }
    }

    private static O1.g.E.EnumC0071g H0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return O1.g.E.EnumC0071g.LineThrough;
            case "underline":
                return O1.g.E.EnumC0071g.Underline;
            case "none":
                return O1.g.E.EnumC0071g.None;
            case "blink":
                return O1.g.E.EnumC0071g.Blink;
            case "overline":
                return O1.g.E.EnumC0071g.Overline;
            default:
                return null;
        }
    }

    private void I(O1.g.M m10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    m10.f4142m = o0(strTrim);
                    break;
                case 16:
                    m10.f4143n = o0(strTrim);
                    break;
                case 17:
                    m10.f4144o = o0(strTrim);
                    break;
                case 18:
                    m10.f4145p = o0(strTrim);
                    break;
            }
        }
    }

    private static O1.g.E.h I0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return O1.g.E.h.LTR;
        }
        if (str.equals("rtl")) {
            return O1.g.E.h.RTL;
        }
        return null;
    }

    private void J(O1.g.C0907r c0907r, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()]) {
                case 26:
                    c0907r.f4228r = o0(strTrim);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    c0907r.f4229s = o0(strTrim);
                    break;
                case 28:
                    O1.g.C0905p c0905pO0 = o0(strTrim);
                    c0907r.f4230t = c0905pO0;
                    if (c0905pO0.h()) {
                        throw new O1.j("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    O1.g.C0905p c0905pO1 = o0(strTrim);
                    c0907r.f4231u = c0905pO1;
                    if (c0905pO1.h()) {
                        throw new O1.j("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new O1.j("Invalid value for attribute markerUnits");
                        }
                        c0907r.f4227q = true;
                    } else {
                        c0907r.f4227q = false;
                    }
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    if ("auto".equals(strTrim)) {
                        c0907r.f4232v = Float.valueOf(Float.NaN);
                    } else {
                        c0907r.f4232v = Float.valueOf(f0(strTrim));
                    }
                    break;
            }
        }
    }

    private Matrix J0(String str) throws O1.j {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            String strO = iVar.o();
            if (strO == null) {
                throw new O1.j("Bad transform function encountered in transform list: " + str);
            }
            switch (strO) {
                case "matrix":
                    iVar.A();
                    float fN = iVar.n();
                    iVar.z();
                    float fN2 = iVar.n();
                    iVar.z();
                    float fN3 = iVar.n();
                    iVar.z();
                    float fN4 = iVar.n();
                    iVar.z();
                    float fN5 = iVar.n();
                    iVar.z();
                    float fN6 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN6) || !iVar.f(')')) {
                        throw new O1.j("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fN, fN3, fN5, fN2, fN4, fN6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    iVar.A();
                    float fN7 = iVar.n();
                    float fX = iVar.x();
                    float fX2 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN7) || !iVar.f(')')) {
                        throw new O1.j("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fX)) {
                        matrix.preRotate(fN7);
                    } else {
                        if (Float.isNaN(fX2)) {
                            throw new O1.j("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fN7, fX, fX2);
                    }
                    break;
                    break;
                case "scale":
                    iVar.A();
                    float fN8 = iVar.n();
                    float fX3 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN8) || !iVar.f(')')) {
                        throw new O1.j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX3)) {
                        matrix.preScale(fN8, fX3);
                    } else {
                        matrix.preScale(fN8, fN8);
                    }
                    break;
                    break;
                case "skewX":
                    iVar.A();
                    float fN9 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN9) || !iVar.f(')')) {
                        throw new O1.j("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fN9)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                    break;
                case "skewY":
                    iVar.A();
                    float fN10 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN10) || !iVar.f(')')) {
                        throw new O1.j("Invalid transform list: " + str);
                    }
                    matrix.preSkew(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) Math.tan(Math.toRadians(fN10)));
                    break;
                    break;
                case "translate":
                    iVar.A();
                    float fN11 = iVar.n();
                    float fX4 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN11) || !iVar.f(')')) {
                        throw new O1.j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX4)) {
                        matrix.preTranslate(fN11, fX4);
                    } else {
                        matrix.preTranslate(fN11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    break;
                    break;
                default:
                    throw new O1.j("Invalid transform list fn: " + strO + ")");
            }
            if (iVar.h()) {
                return matrix;
            }
            iVar.z();
        }
        return matrix;
    }

    private void K(O1.g.C0908s c0908s, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c0908s.f4235q = o0(strTrim);
            } else if (i11 == 2) {
                c0908s.f4236r = o0(strTrim);
            } else if (i11 == 3) {
                O1.g.C0905p c0905pO0 = o0(strTrim);
                c0908s.f4237s = c0905pO0;
                if (c0905pO0.h()) {
                    throw new O1.j("Invalid <mask> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                O1.g.C0905p c0905pO1 = o0(strTrim);
                c0908s.f4238t = c0905pO1;
                if (c0905pO1.h()) {
                    throw new O1.j("Invalid <mask> element. height cannot be negative");
                }
            } else if (i11 != 43) {
                if (i11 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    c0908s.f4234p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new O1.j("Invalid value for attribute maskContentUnits");
                    }
                    c0908s.f4234p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                c0908s.f4233o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new O1.j("Invalid value for attribute maskUnits");
                }
                c0908s.f4233o = Boolean.TRUE;
            }
        }
    }

    private void K0(InputStream inputStream) throws O1.j {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new O1.j("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new O1.j("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new O1.j("SVG parse error", e12);
        }
    }

    private void L(O1.g.C0911v c0911v, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 8) {
                c0911v.f4241o = u0(strTrim);
            } else if (i11 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(f0(strTrim));
                c0911v.f4242p = fValueOf;
                if (fValueOf.floatValue() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    throw new O1.j("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void L0(InputStream inputStream, boolean z9) throws O1.j {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        i iVar = new i(xmlPullParserNewPullParser.getText());
                        r(iVar.r(), x0(iVar));
                    } else if (eventType == 10) {
                        if (z9 && this.f4312a.m() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                K0(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        c1(xmlPullParserNewPullParser.getText());
                    }
                }
                o();
            } catch (IOException e10) {
                throw new O1.j("Stream error", e10);
            }
        } catch (XmlPullParserException e11) {
            throw new O1.j("XML parser problem", e11);
        }
    }

    private void M(O1.g.C0914y c0914y, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c0914y.f4250t = o0(strTrim);
            } else if (i11 == 2) {
                c0914y.f4251u = o0(strTrim);
            } else if (i11 == 3) {
                O1.g.C0905p c0905pO0 = o0(strTrim);
                c0914y.f4252v = c0905pO0;
                if (c0905pO0.h()) {
                    throw new O1.j("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                O1.g.C0905p c0905pO1 = o0(strTrim);
                c0914y.f4253w = c0905pO1;
                if (c0905pO1.h()) {
                    throw new O1.j("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                switch (i11) {
                    case 40:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new O1.j("Invalid value for attribute patternUnits");
                            }
                            c0914y.f4247q = Boolean.TRUE;
                        } else {
                            c0914y.f4247q = Boolean.FALSE;
                        }
                        break;
                    case 41:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new O1.j("Invalid value for attribute patternContentUnits");
                            }
                            c0914y.f4248r = Boolean.TRUE;
                        } else {
                            c0914y.f4248r = Boolean.FALSE;
                        }
                        break;
                    case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                        c0914y.f4249s = J0(strTrim);
                        break;
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                c0914y.f4254x = strTrim;
            }
        }
    }

    private static O1.g.E.i M0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return O1.g.E.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return O1.g.E.i.NonScalingStroke;
        }
        return null;
    }

    private void N(O1.g.C0915z c0915z, Attributes attributes, String str) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.c(attributes.getLocalName(i10)) == g.points) {
                i iVar = new i(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                iVar.A();
                while (!iVar.h()) {
                    float fN = iVar.n();
                    if (Float.isNaN(fN)) {
                        throw new O1.j("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.z();
                    float fN2 = iVar.n();
                    if (Float.isNaN(fN2)) {
                        throw new O1.j("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.z();
                    arrayList.add(Float.valueOf(fN));
                    arrayList.add(Float.valueOf(fN2));
                }
                c0915z.f4255o = new float[arrayList.size()];
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    c0915z.f4255o[i11] = ((Float) obj).floatValue();
                    i11++;
                }
            }
        }
    }

    private static O1.g.C0892b N0(String str) throws O1.j {
        i iVar = new i(str);
        iVar.A();
        float fN = iVar.n();
        iVar.z();
        float fN2 = iVar.n();
        iVar.z();
        float fN3 = iVar.n();
        iVar.z();
        float fN4 = iVar.n();
        if (Float.isNaN(fN) || Float.isNaN(fN2) || Float.isNaN(fN3) || Float.isNaN(fN4)) {
            throw new O1.j("Invalid viewBox definition - should have four numbers");
        }
        if (fN3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            throw new O1.j("Invalid viewBox. width cannot be negative");
        }
        if (fN4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return new O1.g.C0892b(fN, fN2, fN3, fN4);
        }
        throw new O1.j("Invalid viewBox. height cannot be negative");
    }

    private void O(O1.g.Q q10, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 35) {
                q10.f4152p = o0(strTrim);
            } else if (i11 != 36) {
                switch (i11) {
                    case 12:
                        q10.f4149m = o0(strTrim);
                        break;
                    case 13:
                        q10.f4150n = o0(strTrim);
                        break;
                    case 14:
                        O1.g.C0905p c0905pO0 = o0(strTrim);
                        q10.f4151o = c0905pO0;
                        if (c0905pO0.h()) {
                            throw new O1.j("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                        break;
                }
            } else {
                q10.f4153q = o0(strTrim);
            }
        }
    }

    private void O0(Attributes attributes) throws O1.j {
        l("<path>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0911v c0911v = new O1.g.C0911v();
        c0911v.f4146a = this.f4312a;
        c0911v.f4147b = this.f4313b;
        D(c0911v, attributes);
        S(c0911v, attributes);
        W(c0911v, attributes);
        C(c0911v, attributes);
        L(c0911v, attributes);
        this.f4313b.j(c0911v);
    }

    private void P(O1.g.B b10, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                b10.f4039o = o0(strTrim);
            } else if (i11 == 2) {
                b10.f4040p = o0(strTrim);
            } else if (i11 == 3) {
                O1.g.C0905p c0905pO0 = o0(strTrim);
                b10.f4041q = c0905pO0;
                if (c0905pO0.h()) {
                    throw new O1.j("Invalid <rect> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                O1.g.C0905p c0905pO1 = o0(strTrim);
                b10.f4042r = c0905pO1;
                if (c0905pO1.h()) {
                    throw new O1.j("Invalid <rect> element. height cannot be negative");
                }
            } else if (i11 == 10) {
                O1.g.C0905p c0905pO2 = o0(strTrim);
                b10.f4043s = c0905pO2;
                if (c0905pO2.h()) {
                    throw new O1.j("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i11 != 11) {
                continue;
            } else {
                O1.g.C0905p c0905pO3 = o0(strTrim);
                b10.f4044t = c0905pO3;
                if (c0905pO3.h()) {
                    throw new O1.j("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void P0(Attributes attributes) throws O1.j {
        l("<pattern>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0914y c0914y = new O1.g.C0914y();
        c0914y.f4146a = this.f4312a;
        c0914y.f4147b = this.f4313b;
        D(c0914y, attributes);
        S(c0914y, attributes);
        C(c0914y, attributes);
        Y(c0914y, attributes);
        M(c0914y, attributes);
        this.f4313b.j(c0914y);
        this.f4313b = c0914y;
    }

    private void Q(O1.g.F f10, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                f10.f4120q = o0(strTrim);
            } else if (i11 == 2) {
                f10.f4121r = o0(strTrim);
            } else if (i11 == 3) {
                O1.g.C0905p c0905pO0 = o0(strTrim);
                f10.f4122s = c0905pO0;
                if (c0905pO0.h()) {
                    throw new O1.j("Invalid <svg> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                O1.g.C0905p c0905pO1 = o0(strTrim);
                f10.f4123t = c0905pO1;
                if (c0905pO1.h()) {
                    throw new O1.j("Invalid <svg> element. height cannot be negative");
                }
            } else if (i11 == 5) {
                f10.f4124u = strTrim;
            }
        }
    }

    private void Q0(Attributes attributes) throws O1.j {
        l("<polygon>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0915z a10 = new O1.g.A();
        a10.f4146a = this.f4312a;
        a10.f4147b = this.f4313b;
        D(a10, attributes);
        S(a10, attributes);
        W(a10, attributes);
        C(a10, attributes);
        N(a10, attributes, "polygon");
        this.f4313b.j(a10);
    }

    private void R(O1.g.D d10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()] == 37) {
                d10.f4045h = n0(strTrim);
            }
        }
    }

    private void R0(Attributes attributes) throws O1.j {
        l("<polyline>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0915z c0915z = new O1.g.C0915z();
        c0915z.f4146a = this.f4312a;
        c0915z.f4147b = this.f4313b;
        D(c0915z, attributes);
        S(c0915z, attributes);
        W(c0915z, attributes);
        C(c0915z, attributes);
        N(c0915z, attributes, "polyline");
        this.f4313b.j(c0915z);
    }

    private void S(O1.g.L l10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
                if (i11 == 45) {
                    E0(l10, strTrim);
                } else if (i11 != 46) {
                    if (l10.f4139e == null) {
                        l10.f4139e = new O1.g.E();
                    }
                    S0(l10.f4139e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    l10.f4141g = O1.b.f(strTrim);
                }
            }
        }
    }

    static void S0(O1.g.E e10, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f4322b[g.c(str).ordinal()]) {
                case 47:
                    O1.g.O oT0 = t0(str2);
                    e10.f4068b = oT0;
                    if (oT0 != null) {
                        e10.f4066a |= 1;
                    }
                    break;
                case 48:
                    O1.g.E.a aVarE0 = e0(str2);
                    e10.f4070c = aVarE0;
                    if (aVarE0 != null) {
                        e10.f4066a |= 2;
                    }
                    break;
                case 49:
                    Float fR0 = r0(str2);
                    e10.f4072d = fR0;
                    if (fR0 != null) {
                        e10.f4066a |= 4;
                    }
                    break;
                case 50:
                    O1.g.O oT1 = t0(str2);
                    e10.f4074e = oT1;
                    if (oT1 != null) {
                        e10.f4066a |= 8;
                    }
                    break;
                case 51:
                    Float fR1 = r0(str2);
                    e10.f4075f = fR1;
                    if (fR1 != null) {
                        e10.f4066a |= 16;
                    }
                    break;
                case 52:
                    e10.f4076g = o0(str2);
                    e10.f4066a |= 32;
                    break;
                case 53:
                    O1.g.E.c cVarC0 = C0(str2);
                    e10.f4077h = cVarC0;
                    if (cVarC0 != null) {
                        e10.f4066a |= 64;
                    }
                    break;
                case 54:
                    O1.g.E.d dVarD0 = D0(str2);
                    e10.f4078i = dVarD0;
                    if (dVarD0 != null) {
                        e10.f4066a |= 128;
                    }
                    break;
                case 55:
                    e10.f4079j = Float.valueOf(f0(str2));
                    e10.f4066a |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        O1.g.C0905p[] c0905pArrB0 = B0(str2);
                        e10.f4080k = c0905pArrB0;
                        if (c0905pArrB0 != null) {
                            e10.f4066a |= 512;
                        }
                    } else {
                        e10.f4080k = null;
                        e10.f4066a |= 512;
                    }
                    break;
                case 57:
                    e10.f4081l = o0(str2);
                    e10.f4066a |= 1024;
                    break;
                case 58:
                    e10.f4082m = r0(str2);
                    e10.f4066a |= 2048;
                    break;
                case 59:
                    e10.f4083v = b0(str2);
                    e10.f4066a |= 4096;
                    break;
                case 60:
                    h0(e10, str2);
                    break;
                case 61:
                    List listI0 = i0(str2);
                    e10.f4084w = listI0;
                    if (listI0 != null) {
                        e10.f4066a |= 8192;
                    }
                    break;
                case 62:
                    O1.g.C0905p c0905pJ0 = j0(str2);
                    e10.f4046G = c0905pJ0;
                    if (c0905pJ0 != null) {
                        e10.f4066a |= 16384;
                    }
                    break;
                case 63:
                    Integer numL0 = l0(str2);
                    e10.f4047H = numL0;
                    if (numL0 != null) {
                        e10.f4066a |= 32768;
                    }
                    break;
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_STATE /* 64 */:
                    O1.g.E.b bVarK0 = k0(str2);
                    e10.f4048I = bVarK0;
                    if (bVarK0 != null) {
                        e10.f4066a |= 65536;
                    }
                    break;
                case 65:
                    O1.g.E.EnumC0071g enumC0071gH0 = H0(str2);
                    e10.f4049J = enumC0071gH0;
                    if (enumC0071gH0 != null) {
                        e10.f4066a |= 131072;
                    }
                    break;
                case 66:
                    O1.g.E.h hVarI0 = I0(str2);
                    e10.f4050K = hVarI0;
                    if (hVarI0 != null) {
                        e10.f4066a |= 68719476736L;
                    }
                    break;
                case 67:
                    O1.g.E.f fVarG0 = G0(str2);
                    e10.f4051L = fVarG0;
                    if (fVarG0 != null) {
                        e10.f4066a |= 262144;
                    }
                    break;
                case 68:
                    Boolean boolS0 = s0(str2);
                    e10.f4052M = boolS0;
                    if (boolS0 != null) {
                        e10.f4066a |= 524288;
                    }
                    break;
                case 69:
                    String strM0 = m0(str2, str);
                    e10.f4054O = strM0;
                    e10.f4055P = strM0;
                    e10.f4056Q = strM0;
                    e10.f4066a |= 14680064;
                    break;
                case 70:
                    e10.f4054O = m0(str2, str);
                    e10.f4066a |= 2097152;
                    break;
                case 71:
                    e10.f4055P = m0(str2, str);
                    e10.f4066a |= 4194304;
                    break;
                case 72:
                    e10.f4056Q = m0(str2, str);
                    e10.f4066a |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e10.f4057R = Boolean.valueOf(!str2.equals("none"));
                            e10.f4066a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e10.f4058S = Boolean.valueOf(str2.equals("visible"));
                            e10.f4066a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e10.f4059T = O1.g.C0072g.b();
                    } else {
                        try {
                            e10.f4059T = b0(str2);
                        } catch (O1.j e11) {
                            Log.w("SVGParser", e11.getMessage());
                            return;
                        }
                    }
                    e10.f4066a |= 67108864;
                    break;
                case 76:
                    e10.f4060U = r0(str2);
                    e10.f4066a |= 134217728;
                    break;
                case 77:
                    O1.g.C0893c c0893cA0 = a0(str2);
                    e10.f4053N = c0893cA0;
                    if (c0893cA0 != null) {
                        e10.f4066a |= 1048576;
                    }
                    break;
                case 78:
                    e10.f4061V = m0(str2, str);
                    e10.f4066a |= 268435456;
                    break;
                case 79:
                    e10.f4062W = e0(str2);
                    e10.f4066a |= 536870912;
                    break;
                case 80:
                    e10.f4063X = m0(str2, str);
                    e10.f4066a |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        e10.f4064Y = O1.g.C0072g.b();
                    } else {
                        try {
                            e10.f4064Y = b0(str2);
                        } catch (O1.j e12) {
                            Log.w("SVGParser", e12.getMessage());
                            return;
                        }
                    }
                    e10.f4066a |= 2147483648L;
                    break;
                case 82:
                    e10.f4065Z = r0(str2);
                    e10.f4066a |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        e10.f4067a0 = O1.g.C0072g.b();
                    } else {
                        try {
                            e10.f4067a0 = b0(str2);
                        } catch (O1.j e13) {
                            Log.w("SVGParser", e13.getMessage());
                            return;
                        }
                    }
                    e10.f4066a |= 8589934592L;
                    break;
                case 84:
                    e10.f4069b0 = r0(str2);
                    e10.f4066a |= 17179869184L;
                    break;
                case 85:
                    O1.g.E.i iVarM0 = M0(str2);
                    e10.f4071c0 = iVarM0;
                    if (iVarM0 != null) {
                        e10.f4066a |= 34359738368L;
                    }
                    break;
                case 86:
                    O1.g.E.e eVarY0 = y0(str2);
                    e10.f4073d0 = eVarY0;
                    if (eVarY0 != null) {
                        e10.f4066a |= 137438953472L;
                    }
                    break;
            }
        } catch (O1.j unused) {
        }
    }

    private void T(O1.g.U u10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()] == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                u10.f4155o = strTrim;
            }
        }
    }

    private void T0(Attributes attributes) throws O1.j {
        l("<radialGradient>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.Q q10 = new O1.g.Q();
        q10.f4146a = this.f4312a;
        q10.f4147b = this.f4313b;
        D(q10, attributes);
        S(q10, attributes);
        F(q10, attributes);
        O(q10, attributes);
        this.f4313b.j(q10);
        this.f4313b = q10;
    }

    private void U(O1.g.Z z9, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                if (i11 == 39) {
                    z9.f4160p = o0(strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                z9.f4159o = strTrim;
            }
        }
    }

    private void U0(Attributes attributes) throws O1.j {
        l("<rect>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.B b10 = new O1.g.B();
        b10.f4146a = this.f4312a;
        b10.f4147b = this.f4313b;
        D(b10, attributes);
        S(b10, attributes);
        W(b10, attributes);
        C(b10, attributes);
        P(b10, attributes);
        this.f4313b.j(b10);
    }

    private void V(O1.g.a0 a0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                a0Var.f4163o = p0(strTrim);
            } else if (i11 == 2) {
                a0Var.f4164p = p0(strTrim);
            } else if (i11 == 19) {
                a0Var.f4165q = p0(strTrim);
            } else if (i11 == 20) {
                a0Var.f4166r = p0(strTrim);
            }
        }
    }

    private void V0(Attributes attributes) throws O1.j {
        l("<solidColor>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C c10 = new O1.g.C();
        c10.f4146a = this.f4312a;
        c10.f4147b = this.f4313b;
        D(c10, attributes);
        S(c10, attributes);
        this.f4313b.j(c10);
        this.f4313b = c10;
    }

    private void W(O1.g.InterfaceC0903n interfaceC0903n, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.c(attributes.getLocalName(i10)) == g.transform) {
                interfaceC0903n.k(J0(attributes.getValue(i10)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        this.f4312a = new O1.g();
    }

    private void X(O1.g.e0 e0Var, Attributes attributes) throws O1.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                e0Var.f4192q = o0(strTrim);
            } else if (i11 == 2) {
                e0Var.f4193r = o0(strTrim);
            } else if (i11 == 3) {
                O1.g.C0905p c0905pO0 = o0(strTrim);
                e0Var.f4194s = c0905pO0;
                if (c0905pO0.h()) {
                    throw new O1.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                O1.g.C0905p c0905pO1 = o0(strTrim);
                e0Var.f4195t = c0905pO1;
                if (c0905pO1.h()) {
                    throw new O1.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                e0Var.f4191p = strTrim;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(String str, String str2, String str3, Attributes attributes) throws O1.j {
        if (this.f4314c) {
            this.f4315d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVarC = h.c(str2);
            switch (a.f4321a[hVarC.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case 14:
                    h1(attributes);
                    break;
                case 15:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case 21:
                    Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.f4316e = true;
                    this.f4317f = hVarC;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    k(attributes);
                    break;
                case 25:
                    f1(attributes);
                    break;
                case 26:
                    P0(attributes);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    u(attributes);
                    break;
                case 28:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case 30:
                    Z0(attributes);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    V0(attributes);
                    break;
                default:
                    this.f4314c = true;
                    this.f4315d = 1;
                    break;
            }
        }
    }

    private void Y(O1.g.R r10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 7) {
                w0(r10, strTrim);
            } else if (i11 == 87) {
                r10.f4154p = N0(strTrim);
            }
        }
    }

    private void Y0(Attributes attributes) throws O1.j {
        l("<stop>", new Object[0]);
        O1.g.J j10 = this.f4313b;
        if (j10 == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof O1.g.AbstractC0899j)) {
            throw new O1.j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        O1.g.D d10 = new O1.g.D();
        d10.f4146a = this.f4312a;
        d10.f4147b = this.f4313b;
        D(d10, attributes);
        S(d10, attributes);
        R(d10, attributes);
        this.f4313b.j(d10);
        this.f4313b = d10;
    }

    private void Z(String str) {
        this.f4312a.a(new O1.b(O1.b.f.screen, O1.b.u.Document).d(str));
    }

    private void Z0(Attributes attributes) throws O1.j {
        l("<style>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f4322b[g.c(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i11 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && O1.b.b(str, O1.b.f.screen)) {
            this.f4319h = true;
        } else {
            this.f4314c = true;
            this.f4315d = 1;
        }
    }

    private static O1.g.C0893c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.A();
        O1.g.C0905p c0905pQ0 = q0(iVar);
        iVar.z();
        O1.g.C0905p c0905pQ1 = q0(iVar);
        iVar.z();
        O1.g.C0905p c0905pQ2 = q0(iVar);
        iVar.z();
        O1.g.C0905p c0905pQ3 = q0(iVar);
        iVar.A();
        if (iVar.f(')') || iVar.h()) {
            return new O1.g.C0893c(c0905pQ0, c0905pQ1, c0905pQ2, c0905pQ3);
        }
        return null;
    }

    private void a1(Attributes attributes) throws O1.j {
        l("<svg>", new Object[0]);
        O1.g.F f10 = new O1.g.F();
        f10.f4146a = this.f4312a;
        f10.f4147b = this.f4313b;
        D(f10, attributes);
        S(f10, attributes);
        C(f10, attributes);
        Y(f10, attributes);
        Q(f10, attributes);
        O1.g.J j10 = this.f4313b;
        if (j10 == null) {
            this.f4312a.u(f10);
        } else {
            j10.j(f10);
        }
        this.f4313b = f10;
    }

    private static O1.g.C0896f b0(String str) throws O1.j {
        if (str.charAt(0) == '#') {
            O1.c cVarB = O1.c.b(str, 1, str.length());
            if (cVarB == null) {
                throw new O1.j("Bad hex colour value: " + str);
            }
            int iA = cVarB.a();
            if (iA == 4) {
                int iD = cVarB.d();
                int i10 = iD & 3840;
                int i11 = iD & 240;
                int i12 = iD & 15;
                return new O1.g.C0896f(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (iA == 5) {
                int iD2 = cVarB.d();
                int i13 = 61440 & iD2;
                int i14 = iD2 & 3840;
                int i15 = iD2 & 240;
                int i16 = iD2 & 15;
                return new O1.g.C0896f((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
            }
            if (iA == 7) {
                return new O1.g.C0896f(cVarB.d() | (-16777216));
            }
            if (iA == 9) {
                return new O1.g.C0896f((cVarB.d() >>> 8) | (cVarB.d() << 24));
            }
            throw new O1.j("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            i iVar = new i(str.substring(zStartsWith2 ? 5 : 4));
            iVar.A();
            float fN = iVar.n();
            float fD = iVar.d(fN);
            if (!Float.isNaN(fD)) {
                iVar.f('%');
            }
            float fD2 = iVar.d(fD);
            if (!Float.isNaN(fD2)) {
                iVar.f('%');
            }
            if (!zStartsWith2) {
                iVar.A();
                if (!Float.isNaN(fD2) && iVar.f(')')) {
                    return new O1.g.C0896f(s(fN, fD, fD2) | (-16777216));
                }
                throw new O1.j("Bad hsl() colour value: " + str);
            }
            float fD3 = iVar.d(fD2);
            iVar.A();
            if (!Float.isNaN(fD3) && iVar.f(')')) {
                return new O1.g.C0896f((j(fD3 * 256.0f) << 24) | s(fN, fD, fD2));
            }
            throw new O1.j("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(zStartsWith ? 5 : 4));
        iVar2.A();
        float fN2 = iVar2.n();
        if (!Float.isNaN(fN2) && iVar2.f('%')) {
            fN2 = (fN2 * 256.0f) / 100.0f;
        }
        float fD4 = iVar2.d(fN2);
        if (!Float.isNaN(fD4) && iVar2.f('%')) {
            fD4 = (fD4 * 256.0f) / 100.0f;
        }
        float fD5 = iVar2.d(fD4);
        if (!Float.isNaN(fD5) && iVar2.f('%')) {
            fD5 = (fD5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            iVar2.A();
            if (!Float.isNaN(fD5) && iVar2.f(')')) {
                return new O1.g.C0896f((j(fN2) << 16) | (-16777216) | (j(fD4) << 8) | j(fD5));
            }
            throw new O1.j("Bad rgb() colour value: " + str);
        }
        float fD6 = iVar2.d(fD5);
        iVar2.A();
        if (!Float.isNaN(fD6) && iVar2.f(')')) {
            return new O1.g.C0896f((j(fD6 * 256.0f) << 24) | (j(fN2) << 16) | (j(fD4) << 8) | j(fD5));
        }
        throw new O1.j("Bad rgba() colour value: " + str);
    }

    private void b1(Attributes attributes) throws O1.j {
        l("<symbol>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.R t10 = new O1.g.T();
        t10.f4146a = this.f4312a;
        t10.f4147b = this.f4313b;
        D(t10, attributes);
        S(t10, attributes);
        C(t10, attributes);
        Y(t10, attributes);
        this.f4313b.j(t10);
        this.f4313b = t10;
    }

    private static O1.g.C0896f c0(String str) throws O1.j {
        Integer numA = c.a(str);
        if (numA != null) {
            return new O1.g.C0896f(numA.intValue());
        }
        throw new O1.j("Invalid colour keyword: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(String str) {
        if (this.f4314c) {
            return;
        }
        if (this.f4316e) {
            if (this.f4318g == null) {
                this.f4318g = new StringBuilder(str.length());
            }
            this.f4318g.append(str);
        } else if (this.f4319h) {
            if (this.f4320i == null) {
                this.f4320i = new StringBuilder(str.length());
            }
            this.f4320i.append(str);
        } else if (this.f4313b instanceof O1.g.Y) {
            h(str);
        }
    }

    private static O1.g.O d0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return O1.g.C0896f.f4197c;
        }
        if (str.equals("currentColor")) {
            return O1.g.C0072g.b();
        }
        try {
            return b0(str);
        } catch (O1.j unused) {
            return null;
        }
    }

    private void d1(Attributes attributes) throws O1.j {
        l("<text>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.W w10 = new O1.g.W();
        w10.f4146a = this.f4312a;
        w10.f4147b = this.f4313b;
        D(w10, attributes);
        S(w10, attributes);
        W(w10, attributes);
        C(w10, attributes);
        V(w10, attributes);
        this.f4313b.j(w10);
        this.f4313b = w10;
    }

    private static O1.g.E.a e0(String str) {
        if ("nonzero".equals(str)) {
            return O1.g.E.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return O1.g.E.a.EvenOdd;
        }
        return null;
    }

    private void e1(char[] cArr, int i10, int i11) {
        if (this.f4314c) {
            return;
        }
        if (this.f4316e) {
            if (this.f4318g == null) {
                this.f4318g = new StringBuilder(i11);
            }
            this.f4318g.append(cArr, i10, i11);
        } else if (this.f4319h) {
            if (this.f4320i == null) {
                this.f4320i = new StringBuilder(i11);
            }
            this.f4320i.append(cArr, i10, i11);
        } else if (this.f4313b instanceof O1.g.Y) {
            h(new String(cArr, i10, i11));
        }
    }

    private static float f0(String str) throws O1.j {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new O1.j("Invalid float value (empty string)");
    }

    private void f1(Attributes attributes) throws O1.j {
        l("<textPath>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.Z z9 = new O1.g.Z();
        z9.f4146a = this.f4312a;
        z9.f4147b = this.f4313b;
        D(z9, attributes);
        S(z9, attributes);
        C(z9, attributes);
        U(z9, attributes);
        this.f4313b.j(z9);
        this.f4313b = z9;
        O1.g.J j10 = z9.f4147b;
        if (j10 instanceof O1.g.b0) {
            z9.o((O1.g.b0) j10);
        } else {
            z9.o(((O1.g.X) j10).e());
        }
    }

    private static float g0(String str, int i10, int i11) throws O1.j {
        float fB = new O1.d().b(str, i10, i11);
        if (!Float.isNaN(fB)) {
            return fB;
        }
        throw new O1.j("Invalid float value: " + str);
    }

    private void g1(Attributes attributes) throws O1.j {
        l("<tref>", new Object[0]);
        O1.g.J j10 = this.f4313b;
        if (j10 == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof O1.g.Y)) {
            throw new O1.j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        O1.g.U u10 = new O1.g.U();
        u10.f4146a = this.f4312a;
        u10.f4147b = this.f4313b;
        D(u10, attributes);
        S(u10, attributes);
        C(u10, attributes);
        T(u10, attributes);
        this.f4313b.j(u10);
        O1.g.J j11 = u10.f4147b;
        if (j11 instanceof O1.g.b0) {
            u10.o((O1.g.b0) j11);
        } else {
            u10.o(((O1.g.X) j11).e());
        }
    }

    private void h(String str) {
        O1.g.H h10 = (O1.g.H) this.f4313b;
        int size = h10.f4125i.size();
        O1.g.N n10 = size == 0 ? null : (O1.g.N) h10.f4125i.get(size - 1);
        if (!(n10 instanceof O1.g.c0)) {
            this.f4313b.j(new O1.g.c0(str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        O1.g.c0 c0Var = (O1.g.c0) n10;
        sb.append(c0Var.f4175c);
        sb.append(str);
        c0Var.f4175c = sb.toString();
    }

    private static void h0(O1.g.E e10, String str) {
        String strS;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer numA = null;
            O1.g.E.b bVarK0 = null;
            String str2 = null;
            while (true) {
                strS = iVar.s('/');
                iVar.A();
                if (strS != null) {
                    if (numA != null && bVarK0 != null) {
                        break;
                    }
                    if (!strS.equals("normal") && (numA != null || (numA = e.a(strS)) == null)) {
                        if (bVarK0 != null || (bVarK0 = k0(strS)) == null) {
                            if (str2 != null || !strS.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strS;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            O1.g.C0905p c0905pJ0 = j0(strS);
            if (iVar.f('/')) {
                iVar.A();
                String strR = iVar.r();
                if (strR != null) {
                    try {
                        o0(strR);
                    } catch (O1.j unused) {
                        return;
                    }
                }
                iVar.A();
            }
            e10.f4084w = i0(iVar.y());
            e10.f4046G = c0905pJ0;
            e10.f4047H = Integer.valueOf(numA == null ? CommonGatewayClient.CODE_400 : numA.intValue());
            if (bVarK0 == null) {
                bVarK0 = O1.g.E.b.Normal;
            }
            e10.f4048I = bVarK0;
            e10.f4066a |= 122880;
        }
    }

    private void h1(Attributes attributes) throws O1.j {
        l("<tspan>", new Object[0]);
        O1.g.J j10 = this.f4313b;
        if (j10 == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof O1.g.Y)) {
            throw new O1.j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        O1.g.V v10 = new O1.g.V();
        v10.f4146a = this.f4312a;
        v10.f4147b = this.f4313b;
        D(v10, attributes);
        S(v10, attributes);
        C(v10, attributes);
        V(v10, attributes);
        this.f4313b.j(v10);
        this.f4313b = v10;
        O1.g.J j11 = v10.f4147b;
        if (j11 instanceof O1.g.b0) {
            v10.o((O1.g.b0) j11);
        } else {
            v10.o(((O1.g.X) j11).e());
        }
    }

    private void i(Attributes attributes) throws O1.j {
        l("<circle>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0894d c0894d = new O1.g.C0894d();
        c0894d.f4146a = this.f4312a;
        c0894d.f4147b = this.f4313b;
        D(c0894d, attributes);
        S(c0894d, attributes);
        W(c0894d, attributes);
        C(c0894d, attributes);
        A(c0894d, attributes);
        this.f4313b.j(c0894d);
    }

    private static List i0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String strQ = iVar.q();
            if (strQ == null) {
                strQ = iVar.u(',');
            }
            if (strQ == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strQ);
            iVar.z();
        } while (!iVar.h());
        return arrayList;
    }

    private void i1(Attributes attributes) throws O1.j {
        l("<use>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.e0 e0Var = new O1.g.e0();
        e0Var.f4146a = this.f4312a;
        e0Var.f4147b = this.f4313b;
        D(e0Var, attributes);
        S(e0Var, attributes);
        W(e0Var, attributes);
        C(e0Var, attributes);
        X(e0Var, attributes);
        this.f4313b.j(e0Var);
        this.f4313b = e0Var;
    }

    private static int j(float f10) {
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    private static O1.g.C0905p j0(String str) {
        try {
            O1.g.C0905p c0905pA = d.a(str);
            return c0905pA == null ? o0(str) : c0905pA;
        } catch (O1.j unused) {
            return null;
        }
    }

    private void j1(Attributes attributes) throws O1.j {
        l("<view>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.R f0Var = new O1.g.f0();
        f0Var.f4146a = this.f4312a;
        f0Var.f4147b = this.f4313b;
        D(f0Var, attributes);
        C(f0Var, attributes);
        Y(f0Var, attributes);
        this.f4313b.j(f0Var);
        this.f4313b = f0Var;
    }

    private void k(Attributes attributes) throws O1.j {
        l("<clipPath>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0895e c0895e = new O1.g.C0895e();
        c0895e.f4146a = this.f4312a;
        c0895e.f4147b = this.f4313b;
        D(c0895e, attributes);
        S(c0895e, attributes);
        W(c0895e, attributes);
        C(c0895e, attributes);
        B(c0895e, attributes);
        this.f4313b.j(c0895e);
        this.f4313b = c0895e;
    }

    private static O1.g.E.b k0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return O1.g.E.b.Oblique;
            case "italic":
                return O1.g.E.b.Italic;
            case "normal":
                return O1.g.E.b.Normal;
            default:
                return null;
        }
    }

    private void k1(Attributes attributes) throws O1.j {
        l("<switch>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.S s10 = new O1.g.S();
        s10.f4146a = this.f4312a;
        s10.f4147b = this.f4313b;
        D(s10, attributes);
        S(s10, attributes);
        W(s10, attributes);
        C(s10, attributes);
        this.f4313b.j(s10);
        this.f4313b = s10;
    }

    private static Integer l0(String str) {
        return e.a(str);
    }

    private void m(Attributes attributes) throws O1.j {
        l("<defs>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0897h c0897h = new O1.g.C0897h();
        c0897h.f4146a = this.f4312a;
        c0897h.f4147b = this.f4313b;
        D(c0897h, attributes);
        S(c0897h, attributes);
        W(c0897h, attributes);
        this.f4313b.j(c0897h);
        this.f4313b = c0897h;
    }

    private static String m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private void n(Attributes attributes) throws O1.j {
        l("<ellipse>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0898i c0898i = new O1.g.C0898i();
        c0898i.f4146a = this.f4312a;
        c0898i.f4147b = this.f4313b;
        D(c0898i, attributes);
        S(c0898i, attributes);
        W(c0898i, attributes);
        C(c0898i, attributes);
        E(c0898i, attributes);
        this.f4313b.j(c0898i);
    }

    private Float n0(String str) throws O1.j {
        if (str.length() == 0) {
            throw new O1.j("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z9 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z9 = false;
        }
        try {
            float fG0 = g0(str, 0, length);
            float f10 = 100.0f;
            if (z9) {
                fG0 /= 100.0f;
            }
            if (fG0 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f10 = 0.0f;
            } else if (fG0 <= 100.0f) {
                f10 = fG0;
            }
            return Float.valueOf(f10);
        } catch (NumberFormatException e10) {
            throw new O1.j("Invalid offset value in <stop>: " + str, e10);
        }
    }

    static O1.g.C0905p o0(String str) throws O1.j {
        if (str.length() == 0) {
            throw new O1.j("Invalid length value (empty string)");
        }
        int length = str.length();
        O1.g.d0 d0VarValueOf = O1.g.d0.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            d0VarValueOf = O1.g.d0.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d0VarValueOf = O1.g.d0.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new O1.j("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new O1.g.C0905p(g0(str, 0, length), d0VarValueOf);
        } catch (NumberFormatException e10) {
            throw new O1.j("Invalid length value: " + str, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str, String str2, String str3) {
        if (this.f4314c) {
            int i10 = this.f4315d - 1;
            this.f4315d = i10;
            if (i10 == 0) {
                this.f4314c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = a.f4321a[h.c(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case 22:
                    case 23:
                        this.f4316e = false;
                        StringBuilder sb = this.f4318g;
                        if (sb != null) {
                            h hVar = this.f4317f;
                            if (hVar == h.title) {
                                this.f4312a.v(sb.toString());
                            } else if (hVar == h.desc) {
                                this.f4312a.q(sb.toString());
                            }
                            this.f4318g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.f4320i;
                        if (sb2 != null) {
                            this.f4319h = false;
                            Z(sb2.toString());
                            this.f4320i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f4313b = ((O1.g.N) this.f4313b).f4147b;
        }
    }

    private static List p0(String str) throws O1.j {
        if (str.length() == 0) {
            throw new O1.j("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            float fN = iVar.n();
            if (Float.isNaN(fN)) {
                throw new O1.j("Invalid length list value: " + iVar.b());
            }
            O1.g.d0 d0VarV = iVar.v();
            if (d0VarV == null) {
                d0VarV = O1.g.d0.px;
            }
            arrayList.add(new O1.g.C0905p(fN, d0VarV));
            iVar.z();
        }
        return arrayList;
    }

    private void q(Attributes attributes) throws O1.j {
        l("<g>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0902m c0902m = new O1.g.C0902m();
        c0902m.f4146a = this.f4312a;
        c0902m.f4147b = this.f4313b;
        D(c0902m, attributes);
        S(c0902m, attributes);
        W(c0902m, attributes);
        C(c0902m, attributes);
        this.f4313b.j(c0902m);
        this.f4313b = c0902m;
    }

    private static O1.g.C0905p q0(i iVar) {
        return iVar.g("auto") ? new O1.g.C0905p(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : iVar.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, Map map) {
        if (str.equals("xml-stylesheet")) {
            O1.g.k();
        }
    }

    private static Float r0(String str) {
        try {
            float fF0 = f0(str);
            float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (fF0 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                fF0 = f10;
            } else {
                f10 = 1.0f;
                if (fF0 > 1.0f) {
                    fF0 = f10;
                }
            }
            return Float.valueOf(fF0);
        } catch (O1.j unused) {
            return null;
        }
    }

    private static int s(float f10, float f11, float f12) {
        float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f14 = f10 % 360.0f;
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f14 += 360.0f;
        }
        float f15 = f14 / 60.0f;
        float f16 = f11 / 100.0f;
        float f17 = f12 / 100.0f;
        if (f16 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f16 = 0.0f;
        } else if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        if (f17 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f13 = f17 > 1.0f ? 1.0f : f17;
        }
        float f18 = f13 <= 0.5f ? (f16 + 1.0f) * f13 : (f13 + f16) - (f16 * f13);
        float f19 = (f13 * 2.0f) - f18;
        return j(t(f19, f18, f15 - 2.0f) * 256.0f) | (j(t(f19, f18, f15 + 2.0f) * 256.0f) << 16) | (j(t(f19, f18, f15) * 256.0f) << 8);
    }

    private static Boolean s0(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private static float t(float f10, float f11, float f12) {
        float f13;
        if (f12 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        if (f12 < 1.0f) {
            f13 = (f11 - f10) * f12;
        } else {
            if (f12 < 3.0f) {
                return f11;
            }
            if (f12 >= 4.0f) {
                return f10;
            }
            f13 = (f11 - f10) * (4.0f - f12);
        }
        return f13 + f10;
    }

    private static O1.g.O t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new O1.g.C0910u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new O1.g.C0910u(strTrim, strTrim2.length() > 0 ? d0(strTrim2) : null);
    }

    private void u(Attributes attributes) throws O1.j {
        l("<image>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0904o c0904o = new O1.g.C0904o();
        c0904o.f4146a = this.f4312a;
        c0904o.f4147b = this.f4313b;
        D(c0904o, attributes);
        S(c0904o, attributes);
        W(c0904o, attributes);
        C(c0904o, attributes);
        G(c0904o, attributes);
        this.f4313b.j(c0904o);
        this.f4313b = c0904o;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x0287  */
    /* JADX WARN: Code duplicated, block: B:118:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x028f A[SYNTHETIC] */
    private static O1.g.C0912w u0(String str) {
        float f10;
        float f11;
        float f12;
        i iVar = new i(str);
        O1.g.C0912w c0912w = new O1.g.C0912w();
        if (!iVar.h()) {
            int iIntValue = iVar.l().intValue();
            int i10 = 109;
            if (iIntValue == 77 || iIntValue == 109) {
                int iIntValue2 = iIntValue;
                float f13 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float fN = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float fD = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                while (true) {
                    iVar.A();
                    switch (iIntValue2) {
                        case 65:
                        case 97:
                            float f17 = f13;
                            float fN2 = iVar.n();
                            float fD2 = iVar.d(fN2);
                            float f18 = f14;
                            float fD3 = iVar.d(fD2);
                            Boolean boolC = iVar.c(Float.valueOf(fD3));
                            Boolean boolC2 = iVar.c(boolC);
                            float fE = iVar.e(boolC2);
                            float fD4 = iVar.d(fE);
                            if (!Float.isNaN(fD4) && fN2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fD2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                if (iIntValue2 == 97) {
                                    fE += f17;
                                    fD4 += f18;
                                }
                                float f19 = fD4;
                                boolean zBooleanValue = boolC.booleanValue();
                                boolean zBooleanValue2 = boolC2.booleanValue();
                                float f20 = fE;
                                c0912w.d(fN2, fD2, fD3, zBooleanValue, zBooleanValue2, f20, f19);
                                f13 = f20;
                                fN = f13;
                                f14 = f19;
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 67:
                        case 99:
                            float fN3 = iVar.n();
                            float fD5 = iVar.d(fN3);
                            float fD6 = iVar.d(fD5);
                            float fD7 = iVar.d(fD6);
                            float fD8 = iVar.d(fD7);
                            float fD9 = iVar.d(fD8);
                            if (!Float.isNaN(fD9)) {
                                if (iIntValue2 == 99) {
                                    fD8 += f13;
                                    fD9 += f14;
                                    fN3 += f13;
                                    fD5 += f14;
                                    fD6 += f13;
                                    fD7 += f14;
                                }
                                float f21 = fN3;
                                float f22 = fD5;
                                f10 = fD6;
                                fD = fD7;
                                f11 = fD8;
                                f12 = fD9;
                                c0912w.c(f21, f22, f10, fD, f11, f12);
                                fN = f10;
                                f13 = f11;
                                f14 = f12;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 72:
                        case 104:
                            float fN4 = iVar.n();
                            if (!Float.isNaN(fN4)) {
                                if (iIntValue2 == 104) {
                                    fN4 += f13;
                                }
                                f13 = fN4;
                                c0912w.e(f13, f14);
                                fN = f13;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 76:
                        case 108:
                            float fN5 = iVar.n();
                            float fD10 = iVar.d(fN5);
                            if (!Float.isNaN(fD10)) {
                                if (iIntValue2 == 108) {
                                    fN5 += f13;
                                    fD10 += f14;
                                }
                                f13 = fN5;
                                f14 = fD10;
                                c0912w.e(f13, f14);
                                fN = f13;
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 77:
                        case 109:
                            float fN6 = iVar.n();
                            float fD11 = iVar.d(fN6);
                            if (!Float.isNaN(fD11)) {
                                if (iIntValue2 == i10 && !c0912w.i()) {
                                    fN6 += f13;
                                    fD11 += f14;
                                }
                                f13 = fN6;
                                f14 = fD11;
                                c0912w.b(f13, f14);
                                fN = f13;
                                f15 = fN;
                                fD = f14;
                                f16 = fD;
                                iIntValue2 = iIntValue2 != i10 ? 76 : 108;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 81:
                        case 113:
                            fN = iVar.n();
                            fD = iVar.d(fN);
                            float fD12 = iVar.d(fD);
                            float fD13 = iVar.d(fD12);
                            if (!Float.isNaN(fD13)) {
                                if (iIntValue2 == 113) {
                                    fD12 += f13;
                                    fD13 += f14;
                                    fN += f13;
                                    fD += f14;
                                }
                                f13 = fD12;
                                f14 = fD13;
                                c0912w.a(fN, fD, f13, f14);
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 83:
                        case 115:
                            float f23 = (f13 * 2.0f) - fN;
                            float f24 = (2.0f * f14) - fD;
                            float fN7 = iVar.n();
                            float fD14 = iVar.d(fN7);
                            float fD15 = iVar.d(fD14);
                            float fD16 = iVar.d(fD15);
                            if (!Float.isNaN(fD16)) {
                                if (iIntValue2 == 115) {
                                    fD15 += f13;
                                    fD16 += f14;
                                    fN7 += f13;
                                    fD14 += f14;
                                }
                                f10 = fN7;
                                fD = fD14;
                                f11 = fD15;
                                f12 = fD16;
                                c0912w.c(f23, f24, f10, fD, f11, f12);
                                fN = f10;
                                f13 = f11;
                                f14 = f12;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 84:
                        case 116:
                            fN = (f13 * 2.0f) - fN;
                            fD = (2.0f * f14) - fD;
                            float fN8 = iVar.n();
                            float fD17 = iVar.d(fN8);
                            if (!Float.isNaN(fD17)) {
                                if (iIntValue2 == 116) {
                                    fN8 += f13;
                                    fD17 += f14;
                                }
                                f13 = fN8;
                                f14 = fD17;
                                c0912w.a(fN, fD, f13, f14);
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 86:
                        case 118:
                            float fN9 = iVar.n();
                            if (!Float.isNaN(fN9)) {
                                if (iIntValue2 == 118) {
                                    fN9 += f14;
                                }
                                f14 = fN9;
                                c0912w.e(f13, f14);
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 90:
                        case 122:
                            c0912w.close();
                            f13 = f15;
                            fN = f13;
                            f14 = f16;
                            fD = f14;
                            iVar.z();
                            if (iVar.h()) {
                                if (iVar.i()) {
                                    iIntValue2 = iVar.l().intValue();
                                }
                                i10 = 109;
                            }
                            break;
                        default:
                            break;
                    }
                    return c0912w;
                }
            }
        }
        return c0912w;
    }

    private void v(Attributes attributes) throws O1.j {
        l("<line>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0906q c0906q = new O1.g.C0906q();
        c0906q.f4146a = this.f4312a;
        c0906q.f4147b = this.f4313b;
        D(c0906q, attributes);
        S(c0906q, attributes);
        W(c0906q, attributes);
        C(c0906q, attributes);
        H(c0906q, attributes);
        this.f4313b.j(c0906q);
    }

    static O1.e v0(String str) throws O1.j {
        O1.e.b bVar;
        i iVar = new i(str);
        iVar.A();
        String strR = iVar.r();
        if ("defer".equals(strR)) {
            iVar.A();
            strR = iVar.r();
        }
        O1.e.a aVarA = b.a(strR);
        iVar.A();
        if (iVar.h()) {
            bVar = null;
        } else {
            String strR2 = iVar.r();
            strR2.getClass();
            if (strR2.equals("meet")) {
                bVar = O1.e.b.meet;
            } else {
                if (!strR2.equals("slice")) {
                    throw new O1.j("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = O1.e.b.slice;
            }
        }
        return new O1.e(aVarA, bVar);
    }

    private void w(Attributes attributes) throws O1.j {
        l("<linearGradient>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.M m10 = new O1.g.M();
        m10.f4146a = this.f4312a;
        m10.f4147b = this.f4313b;
        D(m10, attributes);
        S(m10, attributes);
        F(m10, attributes);
        I(m10, attributes);
        this.f4313b.j(m10);
        this.f4313b = m10;
    }

    private static void w0(O1.g.P p10, String str) {
        p10.f4148o = v0(str);
    }

    private void x(Attributes attributes) throws O1.j {
        l("<marker>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0907r c0907r = new O1.g.C0907r();
        c0907r.f4146a = this.f4312a;
        c0907r.f4147b = this.f4313b;
        D(c0907r, attributes);
        S(c0907r, attributes);
        C(c0907r, attributes);
        Y(c0907r, attributes);
        J(c0907r, attributes);
        this.f4313b.j(c0907r);
        this.f4313b = c0907r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map x0(i iVar) {
        HashMap map = new HashMap();
        iVar.A();
        String strS = iVar.s('=');
        while (strS != null) {
            iVar.f('=');
            map.put(strS, iVar.q());
            iVar.A();
            strS = iVar.s('=');
        }
        return map;
    }

    private void y(Attributes attributes) throws O1.j {
        l("<mask>", new Object[0]);
        if (this.f4313b == null) {
            throw new O1.j("Invalid document. Root element must be <svg>");
        }
        O1.g.C0908s c0908s = new O1.g.C0908s();
        c0908s.f4146a = this.f4312a;
        c0908s.f4147b = this.f4313b;
        D(c0908s, attributes);
        S(c0908s, attributes);
        C(c0908s, attributes);
        K(c0908s, attributes);
        this.f4313b.j(c0908s);
        this.f4313b = c0908s;
    }

    private static O1.g.E.e y0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return O1.g.E.e.optimizeQuality;
            case "auto":
                return O1.g.E.e.auto;
            case "optimizeSpeed":
                return O1.g.E.e.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set z0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            if (strR.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strR.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.A();
        }
        return hashSet;
    }

    O1.g z(InputStream inputStream, boolean z9) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i10 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i10 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(CodedOutputStream.DEFAULT_BUFFER_SIZE);
            L0(inputStream, z9);
            return this.f4312a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
    }

    private void l(String str, Object... objArr) {
    }
}
