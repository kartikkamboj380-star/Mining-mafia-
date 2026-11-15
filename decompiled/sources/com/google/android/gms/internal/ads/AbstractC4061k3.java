package com.google.android.gms.internal.ads;

import com.reactnativecommunity.clipboard.ClipboardModule;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4061k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f30679a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f30680b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f30681c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static C3935j3 a(String str) {
        long j10;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!AbstractC2546Ve0.b(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw C2817a9.b("Couldn't find xmp metadata", null);
            }
            AbstractC5931yu0 abstractC5931yu0L = AbstractC5931yu0.l();
            long j11 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (AbstractC2546Ve0.b(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = f30679a;
                    int i10 = 0;
                    for (int i11 = 0; i11 < 4; i11++) {
                        String strC = AbstractC2546Ve0.c(xmlPullParserNewPullParser, strArr[i11]);
                        if (strC != null) {
                            if (Integer.parseInt(strC) != 1) {
                                return null;
                            }
                            String[] strArr2 = f30680b;
                            int i12 = 0;
                            while (true) {
                                if (i12 < 4) {
                                    String strC2 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, strArr2[i12]);
                                    if (strC2 != null) {
                                        j10 = Long.parseLong(strC2);
                                        if (j10 != -1) {
                                            break;
                                        }
                                        break;
                                    }
                                    i12++;
                                }
                                j10 = -9223372036854775807L;
                                break;
                            }
                            String[] strArr3 = f30681c;
                            while (true) {
                                if (i10 >= 2) {
                                    abstractC5931yu0L = AbstractC5931yu0.l();
                                    break;
                                }
                                String strC3 = AbstractC2546Ve0.c(xmlPullParserNewPullParser, strArr3[i10]);
                                if (strC3 != null) {
                                    abstractC5931yu0L = AbstractC5931yu0.o(new C3811i3(ClipboardModule.MIMETYPE_JPEG, "Primary", 0L, 0L), new C3811i3("video/mp4", "MotionPhoto", Long.parseLong(strC3), 0L));
                                    break;
                                }
                                i10++;
                            }
                            j11 = j10;
                        }
                    }
                    return null;
                }
                if (AbstractC2546Ve0.b(xmlPullParserNewPullParser, "Container:Directory")) {
                    abstractC5931yu0L = c(xmlPullParserNewPullParser, "Container", "Item");
                } else if (AbstractC2546Ve0.b(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    abstractC5931yu0L = c(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!AbstractC2546Ve0.a(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (abstractC5931yu0L.isEmpty()) {
                return null;
            }
            return new C3935j3(j11, abstractC5931yu0L);
        } catch (C2817a9 | NumberFormatException | XmlPullParserException unused) {
            YU.c("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        String[] strArr = f30679a;
        for (int i10 = 0; i10 < 4; i10++) {
            if (str.contains(String.valueOf(strArr[i10]).concat("=\"1\""))) {
                return true;
            }
        }
        return false;
    }

    private static AbstractC5931yu0 c(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i10 = AbstractC5931yu0.f35482c;
        C5553vu0 c5553vu0 = new C5553vu0();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (AbstractC2546Ve0.b(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strC = AbstractC2546Ve0.c(xmlPullParser, strConcat2);
                String strC2 = AbstractC2546Ve0.c(xmlPullParser, strConcat3);
                String strC3 = AbstractC2546Ve0.c(xmlPullParser, strConcat4);
                String strC4 = AbstractC2546Ve0.c(xmlPullParser, strConcat5);
                if (strC == null || strC2 == null) {
                    return AbstractC5931yu0.l();
                }
                c5553vu0.g(new C3811i3(strC, strC2, strC3 != null ? Long.parseLong(strC3) : 0L, strC4 != null ? Long.parseLong(strC4) : 0L));
            }
        } while (!AbstractC2546Ve0.a(xmlPullParser, str.concat(":Directory")));
        return c5553vu0.j();
    }
}
