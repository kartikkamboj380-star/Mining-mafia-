package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f8601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f8602b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f8603c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SparseArray f8604d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SparseArray f8605e = new SparseArray();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f8606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f8607b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f8608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e f8609d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f8608c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f8824R4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f8830S4) {
                    this.f8606a = typedArrayObtainStyledAttributes.getResourceId(index, this.f8606a);
                } else if (index == i.f8836T4) {
                    this.f8608c = typedArrayObtainStyledAttributes.getResourceId(index, this.f8608c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8608c);
                    context.getResources().getResourceName(this.f8608c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f8609d = eVar;
                        eVar.e(context, this.f8608c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f8607b.add(bVar);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f8610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f8611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f8612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f8613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f8614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        e f8615f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f8610a = Float.NaN;
            this.f8611b = Float.NaN;
            this.f8612c = Float.NaN;
            this.f8613d = Float.NaN;
            this.f8614e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f8970n5);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f8977o5) {
                    this.f8614e = typedArrayObtainStyledAttributes.getResourceId(index, this.f8614e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f8614e);
                    context.getResources().getResourceName(this.f8614e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f8615f = eVar;
                        eVar.e(context, this.f8614e);
                    }
                } else if (index == i.f8984p5) {
                    this.f8613d = typedArrayObtainStyledAttributes.getDimension(index, this.f8613d);
                } else if (index == i.f8991q5) {
                    this.f8611b = typedArrayObtainStyledAttributes.getDimension(index, this.f8611b);
                } else if (index == i.f8998r5) {
                    this.f8612c = typedArrayObtainStyledAttributes.getDimension(index, this.f8612c);
                } else if (index == i.f9005s5) {
                    this.f8610a = typedArrayObtainStyledAttributes.getDimension(index, this.f8610a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f8601a = constraintLayout;
        a(context, i10);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(Context context, int i10) {
        byte b10;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b10 = 4;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b10 = 3;
                            } else {
                                b10 = -1;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 != 0 && b10 != 1) {
                        if (b10 == 2) {
                            aVar = new a(context, xml);
                            this.f8604d.put(aVar.f8606a, aVar);
                        } else if (b10 == 3) {
                            b bVar = new b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (b10 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if ("id".equals(xmlPullParser.getAttributeName(i10))) {
                String attributeValue = xmlPullParser.getAttributeValue(i10);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.l(context, xmlPullParser);
                this.f8605e.put(identifier, eVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }
}
