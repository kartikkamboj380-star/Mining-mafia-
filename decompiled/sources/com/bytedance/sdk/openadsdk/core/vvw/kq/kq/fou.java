package com.bytedance.sdk.openadsdk.core.vvw.kq.kq;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.vvw.nn;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class fou {
    public static Set<nn> kq(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        nn nnVarKq;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(csi.rjo, "vendor");
                    String strOq = null;
                    String strOq2 = null;
                    String strOq3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(csi.rjo, "event"))) {
                                            break;
                                        } else {
                                            strOq3 = csi.oq(xmlPullParser, "Tracking");
                                            break;
                                        }
                                        break;
                                    case "JavaScriptResource":
                                        if (!"omid".equals(xmlPullParser.getAttributeValue(csi.rjo, "apiFramework"))) {
                                            break;
                                        } else {
                                            strOq = csi.oq(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                        break;
                                    case "VerificationParameters":
                                        strOq2 = csi.oq(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strOq) && (nnVarKq = nn.kq(strOq, attributeValue, strOq2, strOq3)) != null) {
                            hashSet.add(nnVarKq);
                        }
                    }
                } else {
                    csi.kq(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
