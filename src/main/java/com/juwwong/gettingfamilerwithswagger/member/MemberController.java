package com.juwwong.gettingfamilerwithswagger.member;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/members")
public class MemberController {

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Member> getMembers() {
		List<Member> members = List.of(new Member(1L, "juwoong1"), new Member(2L, "juwoong2"));

		return members;
	}

	@GetMapping(value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Member getMember(@PathVariable("id") Long memberId) {
		Member member = new Member(memberId, "juwoong");

		return member;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Member createMember(@RequestBody final Member member) {
		return member;
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Member updateMember(@PathVariable("id") final String memberId, @RequestBody final Member member) {
		return member;
	}

	@PatchMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Member updateMemberProperty(@PathVariable("id") final String memberId, final String memberName) {
		Member member = new Member(1L, "juwwong");
		member.updateMemberName(memberName);

		return member;
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteMember(@PathVariable("id") final String memberId) {
	}
}
