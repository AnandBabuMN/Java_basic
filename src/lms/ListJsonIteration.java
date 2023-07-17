package lms;

import java.util.Arrays;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

public class ListJsonIteration {
	public static void main(String[] args) throws JSONException {

		String json = "{\"pkId\":4791,\r\n"
				+ "\"createdAt\":\"2023-03-29T08:44:51.356948\",\r\n"
				+ "\"createdBy\":3,\r\n"
				+ "\"changedAt\":\"2023-03-29T08:44:51.356948\",\r\n"
				+ "\"changedBy\":3,\r\n"
				+ "\"courseName\":\"CA4012\",\"style\":\"Instructor\",\"name\":null,\"duration\":\"20 Days\",\"credits\":12,\"gradingScale\":\"001\",\"accessCode\":false,\"gradingType\":null,\"timeZone\":null,\"moduleOrder\":null,\"modules\":null,\"courseStatus\":{\"pkId\":2,\"createdAt\":\"2022-09-04T11:26:22.999548\",\"createdBy\":1,\"changedAt\":\"2022-09-04T11:26:22.999548\",\"changedBy\":1,\"courseStatus\":\"Unpublished\",\"statusDescription\":\"UnPublish the course\"},\"courseStateDto\":null,\"courseStatusId\":2,\"isArchive\":false,\"courseAccessCode\":null,\"courseImageUrl\":null,\"courseCode\":\"CA4012\",\"catalogId\":{\"pkId\":25,\"createdAt\":\"2022-12-19T04:57:02.42\",\"createdBy\":3,\"changedAt\":\"2022-12-28T11:46:34.771\",\"changedBy\":3,\"name\":\"Testing Demo\",\"parentCatalog\":null,\"tileColor\":null,\"shortDescription\":null,\"longDescription\":null,\"catalogImageFileId\":null,\"mediaType\":null,\"originalFileName\":null,\"fileName\":null,\"pathOfFile\":null},\"courseScheduleCount\":null,\"courseDescription\":\"<p>test </p>\",\"allowSelfEnrollment\":false,\"dripContent\":true,\"moduleCompletion\":true,\"courseDetails\":null,\"courseCategory\":null,\"contactHours\":15,\"creditHours\":15,\"cpeHours\":15,\"attendanceRequired\":false}";
		JSONObject jsonobj = ListJsonIteration.stringToJson(json);
		List<String> arr = Arrays.asList("courseDescription");
		for (String key : arr) {
			if (jsonobj.has(key)) {
				jsonobj.remove(key);
			}
		}   
		System.out.println(jsonobj.toString());
	}
	public static JSONObject stringToJson(String jsonString) throws JSONException {
		return new JSONObject(jsonString);
	}
}
