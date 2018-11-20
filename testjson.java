import com.google.gson.*;




public class Main {

    public static void main(String[] args) {

        int x=5;
        int y=6;
        System.out.println("x=" + x + "; y=" + y);
        String string = "{\n" +
                "  \"data\": {\n" +
                "    \"repository\": {\n" +
                "      \"milestones\": {\n" +
                "        \"nodes\": [\n" +
                "          {\n" +
                "            \"issues\": {\n" +
                "              \"nodes\": [\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-10T09:17:42Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-10T09:18:03Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-10T09:17:32Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-10T09:17:57Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-10T09:17:24Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-10T09:17:52Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-10T09:16:19Z\",\n" +
                "                  \"closed\": true\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"state\": \"CLOSED\",\n" +
                "            \"dueOn\": \"2018-10-10T00:00:00Z\",\n" +
                "            \"title\": \"Первая итерация\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"issues\": {\n" +
                "              \"nodes\": [\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-22T08:31:06Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-22T08:30:26Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-23T09:20:38Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-22T23:02:43Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-22T19:11:52Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-22T19:11:15Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-22T19:10:49Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-22T19:11:31Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-24T07:56:40Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-17T13:23:44Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-18T06:39:22Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-24T07:57:19Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-13T11:12:23Z\",\n" +
                "                  \"closed\": true\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"state\": \"CLOSED\",\n" +
                "            \"dueOn\": \"2018-10-24T00:00:00Z\",\n" +
                "            \"title\": \"Вторая итерация\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"issues\": {\n" +
                "              \"nodes\": [\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-11-06T15:08:46Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-11-06T15:08:04Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-10-28T12:31:14Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-11-06T15:10:47Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-11-05T08:28:13Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-11-05T08:28:56Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-11-11T10:16:24Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-11-06T15:13:38Z\",\n" +
                "                  \"closed\": true\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": \"2018-11-06T15:13:18Z\",\n" +
                "                  \"closed\": true\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"state\": \"CLOSED\",\n" +
                "            \"dueOn\": \"2018-11-07T00:00:00Z\",\n" +
                "            \"title\": \"Третья итерация\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"issues\": {\n" +
                "              \"nodes\": [\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                },\n" +
                "                {\n" +
                "                  \"closedAt\": null,\n" +
                "                  \"closed\": false\n" +
                "                }\n" +
                "              ]\n" +
                "            },\n" +
                "            \"state\": \"OPEN\",\n" +
                "            \"dueOn\": \"2018-11-21T00:00:00Z\",\n" +
                "            \"title\": \"Четвёртая итерация\"\n" +
                "          },\n" +
                "          {\n" +
                "            \"issues\": {\n" +
                "              \"nodes\": []\n" +
                "            },\n" +
                "            \"state\": \"OPEN\",\n" +
                "            \"dueOn\": \"2018-12-05T00:00:00Z\",\n" +
                "            \"title\": \"Пятая итерация\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}"; // The String which Need To Be Converted
        JsonObject convertedObject = new Gson().fromJson(string, JsonObject.class);
        System.out.println(convertedObject);
        JsonObject trymilestones=
                convertedObject.getAsJsonObject("data").getAsJsonObject("repository").getAsJsonObject("milestones");
        JsonArray nodes=trymilestones.getAsJsonArray("nodes");
        System.out.println(nodes);
        int count=0;
        int count1=0;
        int countmile=0;
        for (JsonElement a:nodes
             ) {
            System.out.println(a);
            String text=a.toString();
            String replace = "\"closed\":true";
            count += (text.length()- (text.replaceAll(replace, "").length())) / replace.length();
            System.out.println(count);
            replace = "\"closed\":false";
            count1 += (text.length()- (text.replaceAll(replace, "").length())) / replace.length();
            System.out.println(count1);
            replace = "state\":\"CLOSED\"";
            countmile+=(text.length()- (text.replaceAll(replace, "").length())) / replace.length();
            

        }

     double sum = count+count1;
     double ans=0;
     if(sum==0) ans=1; else ans=count/sum;
     double ret=ans*(countmile+1)/(nodes.size());
     System.out.print(ret);




    }
}
