package ctz.com.timetable;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class recent extends Fragment {


//    String COURSE_CODE,Activity_code;
//    private String TAG = Activity_Result_Template.class.getSimpleName();
//    private ProgressDialog pDialog;
//    private ListView lv;
//    int size;
//    private static String url;
//    ArrayList<HashMap<String, String>> contactList;
//    String array[]=new String[100];
//    JSONArray contacts;
//    int name_length;
//    int list_size=0;
    TextView empty;
    public recent() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Activity_Result_Template activity = (Activity_Result_Template)getActivity();
//        url="http://rpi1.pe.hu/getfileserver.php?refno=";
//        COURSE_CODE = activity.COURSE_CODE;
//        Activity_code= activity.Activity_code;
//        url=url.concat(COURSE_CODE);
//        url=url.concat("&type=1");
//        contactList = new ArrayList<>();
//        new GetContacts().execute();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_fragment_recent,container,false);
//        lv = (ListView) rootView.findViewById(R.id.list2);
   empty=(TextView)rootView.findViewById(R.id.mse_empty);
//        empty.setVisibility(GONE);
        return rootView;
    }





//    private class GetContacts extends AsyncTask<Void, Void, Void> {
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//            pDialog = new ProgressDialog(getActivity());
//            pDialog.setMessage("Please wait...");
//            pDialog.setCancelable(false);
//            pDialog.show();
//
//        }
//
//        @Override
//        protected Void doInBackground(Void... arg0) {
//            HttpHandler sh = new HttpHandler();
//
//            // Making a request to url and getting response
//            String jsonStr = sh.makeServiceCall(url);
//
//            Log.e(TAG, "Response from url: " + jsonStr);
//
//            if (jsonStr != null) {
//                try {
//
//                    contacts = new JSONArray(jsonStr);
//                    list_size=contacts.length();
//                    // looping through All Contacts
//                    for (int i = 0; i < contacts.length(); i++) {
//                        JSONObject c = contacts.getJSONObject(i);
//                        list_size=1;
//                        //  String id = c.getString("id");
//                        String name = c.getString("name");
//                        String link = c.getString("link");
//                        String year = c.getString("year");
//                        String by = c.getString("uploadby");
//
//                        size=name.length();
//
//                        // tmp hash map for single contact
//                        HashMap<String, String> contact = new HashMap<>();
//                        name_length =name.length();
//                        // adding each child node to HashMap key => value
//                        //  contact.put("id", id);
//
//
//                        contact.put("name",(i+1)+". MSE_"+COURSE_CODE);
//
//                        contact.put("link", link);
//                        contact.put("year", year);
//                        contact.put("by",by);
//                        array[i] = link;
//                        // adding contact to contact list
//                        contactList.add(contact);
//                    }
//                } catch (final JSONException e) {
//                    list_size=0;
//                    Log.e(TAG, "Json parsing error: " + e.getMessage());
//
//                }
//            } else {
//                list_size=0;
//                Log.e(TAG, "Couldn't get json from server.");
//
//
//            }
//
//            return null;
//        }
//
//        @Override
//        protected void onPostExecute(Void result) {
//            super.onPostExecute(result);
//            // Dismiss the progress dialog
//            if (pDialog.isShowing())
//                pDialog.dismiss();
//            /**
//             * Updating parsed JSON data into ListView
//             * */
//          if (list_size!=0)
//          {
//
//              ListAdapter adapter = new SimpleAdapter(
//                      getActivity(), contactList,
//                      R.layout.list_item, new String[]{"name",
//                      "year","by"}, new int[]{R.id.name,
//                      R.id.year, R.id.by});
//
//              lv.setAdapter(adapter);
//          }else
//          {
//              if (empty.getVisibility()==GONE)
//              {
//                  empty.setVisibility(View.VISIBLE);
//              }
//              if (lv.getVisibility()==View.VISIBLE)
//              {
//                  lv.setVisibility(View.GONE);
//              }
//          }
//
//            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//                    String doc=array[position];
//                    doc="http://docs.google.com/viewer?url="+doc;
//                    Uri uri = Uri.parse(doc);
//                    CustomTabsIntent customTabsIntent = new CustomTabsIntent.Builder().addDefaultShareMenuItem().enableUrlBarHiding().setCloseButtonIcon(BitmapFactory.decodeResource(
//                            getResources(), R.drawable.ic_arrow_back)).setToolbarColor(Color.parseColor("#0b3351")).build();
//
//                    CustomTabActivityHelper.openCustomTab(getActivity(), customTabsIntent, uri,
//                            new CustomTabActivityHelper.CustomTabFallback() {
//                                @Override
//                                public void openUri(Activity activity, Uri uri) {
//                                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                                    activity.startActivity(intent);
//                                }
//                            });
//                }
//            });
//        }
//
//    }
}